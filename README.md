
# Moiz .Automation Task

The project has created with the cucumber framework which used the one feature file with multiple scenarios. Log4j2 and Allure Report has also been implemented in the framework.

# Test Scenarios

- Scenario 1: Successful login with valid credentials
- Scenario 2: Successful login with valid credentials with DTT
- Scenario 3: Successful Order Placing journey

# Feature File
Created one Feature file which has three scenarios.

### Background
All the common steps added under the Background

### Scenario 1: Successful login with valid credentials
Scenario 1 is all about the user getting login to the application with valid credentials and then logout the application.

### Scenario 2: Successful login with valid credentials with DTT
DDT has been used in scenario 2 for the username and password, and the scenario is all about the user getting login to the application with valid credentials and then logout the application.

### Scenario 3: Successful Order Placing journey
The complete order placed journey has been covered in this scenario where assertions have also been used after every action.

# PageObject
A separate class has been created for all the pages where all the methods and assertions has putted. All the element's addresses have been put in the separate Enum file and called to the page classes.

# Step Definition
### Base class
In a Base class where initialize all the variables and extend this class to all page object classes and step def classe.
### StepDef class
In the step def class where mentioned all the steps methods are mentioned in the feature file and call all the methods from the page object classes.

# Runner
The configuration has been added to the Runner class which are mentioned the feature file link, tags, and plugin for the allure report

# Log4j2
log4j2 has been implemented in the framework for logging. Once the script will run the file name called app.log would be auto-generated under the ResultLogs folder.

# Allure report
Allure report has been configured in the framework. Below are the steps to run the Allure Report.
1. Once the script has run the folder name allure-results would be created on the root project directory.
2. Right-click on the allure-results folder and go to option Open in >>Explorer, the project local folder would open
3. Type the allure serve on the folder command line. The Allure Report would be generated.
4. If any test case would be failed the screenshot will also be attached to the report beside the test step.
