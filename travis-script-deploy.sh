#!/bin/bash

set +x +e

cp .travis.settings.xml $HOME/.m2/settings.xml
if [[ "$TRAVIS_BRANCH" =~ ^release/ ]] ; then ./release.sh ; else ./deploy.sh ; fi
