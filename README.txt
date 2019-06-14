1. How to start the application:
	In command prompt open the dist folder and write the following command: java -jar "PayDesk.jar"

2. How to use the application:
	After the application starts, in the console will be displayed mock data about each of the cards.

3. How does the application work:
	The app uses the following classes:
	Class "Card" is abstract and is used to store infomation about the card. Each card has an owner (instance of User class), turnover and initial discount rate. The class has a single constructor which allows you to supply the initial discount rate for the card.There are also getters and setters. There is an abstract method "getDiscountRate" which is supposed to be overridden by the classes that extend this one.
	
	Class "User" has two properties, a constructor which sets the properties and getter and setter methods.

	Class "BronzeCard" extends class Card. It has a constructor which calls the constructor from class Card. The method "getDiscountRate" is overridden. Using the condition given in the assignment, the method works as it follows:
	1. If the turnover for the previous month is below 100, there isn't a discount rate.
	2. If the turnover is between 100 and 300, the discount rate is 1%.
	3. If the turnover is above 300, the discount rate is 2.5%.

	Class "SilverCard" extends class Card. It has a constructor which calls the constructor from class Card. The method "getDiscountRate" is overridden. Using the condition given in the assignment, the method works as it follows:
	1. If the turnover is above 300, the discount rate is 3.5%
	2. If the turnover is below 300, the discount rate is 2% by default.

Class "GoldCard" extends class Card. It has a constructor which calls the constructor from class Card. The method "getDiscountRate" is overridden. Using the condition given in the assignment, the method works as it follows:
	1. If the turnover is below 100 the discount rate is 2%
	2. The discount rate grows 1% for each $100 from the turnover, capping at 10%.

	Class "PayDesk" is the entry point of the application with its "main" function. It has a static method "makePurchase" which outputs the purchase value, the discount rate, the discount and the total purchase value.
	In the main function for each card is invoked the "makePurchase" method with the example values given in the task.
	