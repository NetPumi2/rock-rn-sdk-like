#! /bin/bash

# Exit immediately if any command returns a non-zero status
set -e

trap 'echo "Build interrupted"; exit 1' INT

pushd android
./gradlew clean
./gradlew walleepaymentreact:bundleReleaseAar
./gradlew walleepaymentreact:bundleDebugAar

echo -e "✅ AARs built successfully: \n android/walleepaymentreact/build/outputs/aar/walleepaymentreact-debug.arr \n android/walleepaymentreact/build/outputs/aar/walleepaymentreact-release.arr"

 ./gradlew publishToMavenLocal

# com/walleepaymentreact/walleepayment/0.0.1-local


echo "✅ AARs published to mavenLocal: com.walleepaymentreact.walleepayment:0.0.1-local"