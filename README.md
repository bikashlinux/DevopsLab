# DevOps-Project : Milestone 2 (M2)

### Introduction ###
We have used Jenkins as the Build server for this task. We have used a sample Apache Maven Project for calculator operations. 

As a part of this task, we will demonstrate the following:
* The ability to run JUnit Tests 
* Create random tests using Randoop for unit test generation through Eclipse
* Run static analysis using Checkstyle
* Custom analysis by adding two checks in checkstyle's xml
* Rejecting commits if tests fail or checkstyle generates errors
* Rejecting commits if there are files which contain security tokens of AWS/Digital Ocean or private ssh keys

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

### Analysis ###
* We have used CheckStyle as the static analysis tool
* Configured CheckStyle plugin in Maven and Jenkins
  * Maven: Update pom.xml to include `maven-checkstyle-plugin`
  * Jenkins: Go to Manage Jenkins --> Manage Plugins --> Install `Checkstyle Plugin`
* Initial Build would pick up the default Checkstyle xml namely sun-checks.xml
* For customizing the static analysis, we used the default xml and copied the contents inside `checkstyle.xml`. We added two additionals rules in the end
  * Detect `@author` tags and report warnings
  * Detect classes that begin with lowercase and report errors

### Screencast Link ###
