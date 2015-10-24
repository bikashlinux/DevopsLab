# DevOps-Project : Milestone 2 (M2), TEST + ANALYSIS

### Introduction ###
We have used Jenkins as the Build server for this task. We have used a sample Maven Project for calculator operations cloned from [here] (https://github.com/kranonit/calculator-unit-test-example-java). 

As a part of this milestone, we will demonstrate the following:
* The ability to run JUnit Tests 
* Create random tests using Randoop for unit test generation through Eclipse
* Run static analysis using Checkstyle
* Custom analysis by adding two checks in checkstyle's xml
* Rejecting commits if tests fail or checkstyle generates errors
* Rejecting commits if there are files which contain security tokens of AWS/Digital Ocean or private ssh keys

We have created a job in Jenkins that would track a local git repository. Build would be triggered by a post-commit hook. For rejecting commits on test failure or checkstyle errors, the build status inside Jenkins would be set to `Failure`. The post-commit hook would read the build status and if it detects a `Failed Build`, we are reseting the repo to the previous commit, thus rejecting this commit.

### Test ###
* Used Cobertura for reporting code coverage
* Configured Cobertura plugin in Maven and Jenkins
  * Maven: Update pom.xml to include `cobertura-maven-plugin`
  * Jenkins: Go to Manage Jenkins --> Manage Plugins --> Install `Cobertura Plugin`
* Initial Build displays the coverage report in Jenkins with low coverage
* Opened the project in Eclipse
* Configured Randoop plugin in Eclipse
  * Open Help --> Install new plugin --> Enter this url `http://randoop.googlecode.com/hg/plugin.updateSite/`
* Run the Calculator.java file as 'Randoop Test Input' and customize the directory to 'src/test/java' and number of tests to any random number like 100
* This generates random unit tests for Calculator.java and maven will include these in addition to the existing tests for running unit tests
* Now the Build displays the coverage report in Jenkins with improved coverage
* For failing the build based on failed tests, we configured MAVEN_OPTS with the following command `-Dmaven.test.failure.ignore=false`

### Analysis ###
* We have used CheckStyle as the static analysis tool
* Configured CheckStyle plugin in Maven and Jenkins
  * Maven: Update pom.xml to include `maven-checkstyle-plugin`
  * Jenkins: Go to Manage Jenkins --> Manage Plugins --> Install `Checkstyle Plugin`
* Initial Build would pick up the default Checkstyle xml namely sun-checks.xml
* For customizing the static analysis, we used the default xml and copied the contents inside `checkstyle.xml`. We added two additionals rules in the end
  * Detect `@author` tags and report warnings
  * Detect classes that begin with lowercase and report errors
* Now the build generates the checkstyle errors based on the new xml namely `checkstyle.xml`
* For failing the build based on checkstyle errors, we configured Maven Goals with the additional Goal `checkstyle:check`

### Tokens & Private keys ###
* We have written a pre-commit hook to detect if any file in the current git-diff contains security credentials or private ssh keys
* We have written a python script that would test if any file from the current diff contains such credentials. If yes, the commit would be rejected and no build will be triggered

### Screencast Link ###
[Demo] (https://youtu.be/aB3Yjv4tjMg)
