#!/bin/bash
set -x -e

if [ "$TRAVIS" != "true" ] ; then 
    echo "Not running on travis, not supported at the moment"
    exit 1
fi

RELEASE_VERSION=$(echo "$TRAVIS_BRANCH" | sed -e "s/release[/]//")

if ! [[ "${RELEASE_VERSION}" =~ [0-9]+[.][0-9]+[.][0-9]+ ]] ; then
    echo "Invalid branch name: $TRAVIS_BRANCH"
	exit 1
fi

POM_VERSION=`mvn org.apache.maven.plugins:maven-help-plugin:2.1.1:evaluate -Dexpression=project.version | sed -n -e '/^\[.*\]/ !{ /^[0-9]/ { p; q } }'`

if [ "${RELEASE_VERSION}-SNAPSHOT" != "${POM_VERSION}" ] ; then
	echo "Branch version ${RELEASE_VERSION} is not a SNAPSHOT or does not match POM version ${POM_VERSION}, assuming release was already done"
	exit 0
fi

# MANIFEST.MF files might have been modified during previous steps, so we need to revert 
# these changes before release:prepare
git stash save

# Unshallow local repo to allow mvn release to work
git fetch --unshallow
git config remote.origin.fetch "+refs/heads/*:refs/remotes/origin/*"
git fetch origin

# Checkout branch (travis-ci has checked out the commit hash)
# Note: if the branch has been updated in between, this will use a newer 
# revision than before, but for making the release this should not usually 
# happen, and should not matter anyway, since the newer revision would be 
# used by a subsequent build and overwrite the tag
git checkout $TRAVIS_BRANCH

#mvn -B release:prepare -DreleaseVersion=1.0.0 -DdevelopmentVersion=1.0.1-SNAPSHOT
mvn -B release:prepare -DreleaseVersion=${RELEASE_VERSION}
mvn -B release:perform
