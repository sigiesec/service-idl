#!/bin/bash
set -x -e

if [ "$TRAVIS" != "true" ] ; then 
    echo "Not running on travis, not supported at the moment"
    exit 1
fi

if [ "$TRAVIS_TAG" == "" ] ; then
	SNAPSHOT_FRAGMENT="-SNAPSHOT"
	BASE_VERSION=`mvn org.apache.maven.plugins:maven-help-plugin:2.1.1:evaluate -Dexpression=project.version | sed -n -e '/^\[.*\]/ !{ /^[0-9]/ { p; q } }' -e 's/$SNAPSHOT_FRAGMENT//'`

	if [ "$TRAVIS_PULL_REQUEST" == "false" ] ; then
		if [ "$TRAVIS_BRANCH" != "master" ] ; then
			BRANCH_FRAGMENT="-${TRAVIS_BRANCH////-}"
		else
			BRANCH_FRAGMENT=""
		fi
	else
		BRANCH_FRAGMENT="-pr${TRAVIS_PULL_REQUEST}"
	fi

	cd com.btc.serviceidl.plainjava && mvn versions:set -DnewVersion=${BASE_VERSION}${BRANCH_FRAGMENT}${SNAPSHOT_FRAGMENT}
fi

mvn deploy -DskipTests
