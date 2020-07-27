# QA_Assignment
## How to Run the project

## Pre-required
```
1) Install JDK 1.8 
2) Maven 3.6.3 [add maven installation path to PATH env variable] 
```

Check if both installed properly in browser by entering below URLS
```
java -version  		[it should show the installed version]
mvn -version 		[it should show the installed version]
```

Git Repository URL: https://github.com/ravidkone/HYD_Assignment

## Steps to execute:
Step 1: Go to your cmd/terminal and and create a folder
        inside that folder clone the git repository and move to the new folder
```
  $ mkdir “run_test” 
  $ cd run_test
  $ git clone https://github.com/ravidkone/HYD_Assignment
``` 
 cd “project folder name” [change directory to project folder]

Once we are inside the project folder enter below maven commands to execute the project
```
$ mvn clean     // [it will scan the project and do a clean install]
$ mvn test      // [this will start executing the test cases]


Note: for the first time it will download the all the required jars(it may take little time) 
and then execute the test cases, from second time onward it will be faster.
```

## How to open the project in Eclipse IDE
Step 1: Open Eclipse IDE, click on File Tab and select "Open Projects from File System.." 
#
Step 2: It will open dialogue box, click on "directory" and choose the project folder and click on Finish

## Project Details
    - Under "src/main/java" we can find Testbase,config,Utility packages, StepDefinition and POM(pages)
    - Under "src/main/test" we can find the TestRunner file.
    - Under "FeatureFileTest" we can find the feature files.
    - Under "Test Output" folder, we can find index.html report file to check the test results.
    - Under "pom.xml" we can find all the dependedancies and plugins
