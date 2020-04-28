# jeeservice

Basic sample with RestEasy for take it as proxy.

## Getting Started


### Prerequisites

* JDK 8
* Java IDE
* Maven
* Wildfly-10.0.0.Final

## Deployment

You will need a base wildfly 10.0.0.Final, put the ear on deployment folder and start it using standalone.bat.

## Check if container is up

When the service is deployed, wildfly generates a file with ext **.deployed** like "jeeservice-ear.ear.deployed" . 
Also you can check the status with the health check service.

## JeeService REST Services

So like you see the app context is **jeeservice**
For a complete reference of how to call this services, please check Insomnia JSON file (in dev_tools folder).

## Java Doc

For check java doc about service once you have already download the sources you can run **mvn clean install** or **mvn clean package** command, this will generate ear file for  services, also that will run unit and integration tests and generate javadoc for this project. After the process will done, check on every child project this route:

**{{ the child project }}/target/apidocs** inside must be a file named 'index.html' open with your prefered browser and enjoy.

## Java Test and Code Coverage

In this project I am using:

* [JUnit 5](https://junit.org/junit5/)
* [Mockito](https://site.mockito.org/)

After you build the project you can inspect:

**On every child project**

- /target/failsafe-reports -> Integration test results
- /target/surefire-reports -> Unit test results
- /site/jacoco-ut          -> Java Code Coverage (JaCoCo) provided by unit test (inside must be a file named 'index.html' open with your prefered browser)
- /site/jacoco-it          -> Java Code Coverage (JaCoCo) provided by integration test (inside must be a file named 'index.html' open with your prefered browser)

**On parent project**
- /target/jacoco-ut.exec   -> Merged JaCoCo unit test file for export metrics to analyze with tools like SonarQube
- /target/jacoco-ut.exec   -> Merged JaCoCo integration test file for export metrics to analyze with tools like SonarQube

You can check project metrics using the provided sonar-project.properties in parent project. Enjoy

## Formatter

At this moment I am using formatter-maven-plugin for avoid to have diff between code format on developer ide's.
That's because we can have small changes, but if our formmater is different it may cause a lot of git diffs and is not convenient for merge our changes. 
During the build this plugin run the goal validate, so if one class
doesn't comply with established format, build will fails, to fix run -> **mvn formatter:format**.
Ensure before your merges to run that goal please. If you want to know more about the plugin or want to change to a custom checkstyle please check [formatter-maven-plugin](https://code.revelc.net/formatter-maven-plugin/) for more details. 
**I suggest to run this goal before merge your changes for CI/Push.**

## Built With

* [Java](https://www.java.com/en/download/) - Programming language
* [Maven](https://maven.apache.org/) - Dependency Management
* [Wildfly](http://wildfly.org/) - Server/Container
* [Jenkins](https://jenkins.io/) - CI

## Contributors

* **Alexander Galvis Grisales** - *Initial status*
