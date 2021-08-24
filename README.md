# FoodOrder
FoodOrder - README.md

**Import a maven project in Eclipse**

	•	Open Eclipse.
	•	Select File > Import > option.
	•	Select Maven Projects Option. Click on Next Button.
	•	Select Project location, where a project was created using Maven.
	•	Click Finish Button.
	•	Now, you can see the maven project in eclipse.
	•	Now, have a look at FoodOrder project properties. (Properties -> Java Build Path -> Libraries) You can see that Eclipse has added Maven dependencies to java build path.
	•	To build this project using maven capability of eclipse, right Click on FoodOrder project to open context menu.
	•	Select Run as option - Maven Clean
	•	Check the logs to see a successful log
	•	Run - Maven Test
	•	Maven will start building the project. Check the Test Results in Eclipse Console 

**Project Details**

	•	FoodOrder project is developed in Eclipse with Maven and TestNG using Java
	•	This project is structures as below:
	⁃	src/main/java - has two java files and a .properties file
	⁃	data.properties : This file is used to set all the constant values needed for this program. Food need depending on the size of the dog, Buffer percentage to order food, the maximum number of dogs the shelter can accomodate, Minimum buffer percentage.
	⁃	Base.java : This class is used to read the values from the properties file.
	⁃	CalculateQuantity : This is the main class where we have logic for all the calculations and verifications
	⁃	src/test/java - has two test files
	⁃	UnitTest.java: includes all the unit tests for the Food Order project
	⁃	PositiveTest.java : This file contains all the regular tests along with edge cases. Multiple sets of data is used for Tests with DataProviders.
	⁃	pom.xml - this file has all the maven dependencies to run the project.

**Test Details**

	•	Unit Test
	⁃	testSum() - verify that the total number of dogs is correct
	⁃	test quantity() - verify the calculation for amount of food to order for next month is correct.
	•	Positive Test
	⁃	verifyTotalDogs() - Verify that the sum of number of dogs is not greater than 30
	⁃	verifyInput() - Verify that input (number of small, medium and large dogs  is all positive integers
	⁃	verifyExtraPCT() - Verify that when ordering food you always want to order at least 20% (configurable in data.properties) more
	⁃	verifyCalculation() - Verify the calculation to order food is correct. Check if the calculated value matches the expected value.
	
**Edge Cases**

	⁃	When food to order is zero
	⁃	When there is surplus food from last month and no need to order the it should return zero and not negative number.



 
