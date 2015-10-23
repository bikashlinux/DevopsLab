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
* Initial Build displays the coverage report in Jenkins with low coverage
* Opened the project in Eclipse
* Configured Randoop plugin in Eclipse
* Run the Calculator.java file as 'Randoop Test Input' and customize the directory and number of tests
* This generates random unit tests for Calculator.java and maven will include these in addition to the existing tests for running unit tests
* Now the Build displays the coverage report in Jenkins with improved coverage

### Analysis ###

### Screencast Link ###
