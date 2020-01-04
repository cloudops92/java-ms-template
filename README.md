# java-ms-template

![](https://github.com/mishalshah92/java-ms-template/workflows/java-ms-template-ci/badge.svg)

This is java micro-service template. This template allows to build and deploy docker image simply.
This template is very basic having integration of spring boot > 2.


Basic knowledge of the [Gradle](https://gradle.org) and [Docker](https://www.docker.com/) is
require.

## Building and Generating docker image
We uses the [Avast plugins](https://github.com/avast/gradle-docker-compose-plugin) 
that allows to configure and manager docker images.

All configurations are present into the `configs/docker.gradle`

## Build
Below command will generate the distribution zip under `build/distributions/{app_name}.zip` directory

###### Build the Application
~~~~
$ ./gradlew build
~~~~

###### Build the docker image
~~~~
$ ./gradlew composeBuild
~~~~

###### Running Docker image
~~~~
$ ./gradlew composeUp
~~~~

## Communication

- **Email**: mishalshah92@gmail.com
