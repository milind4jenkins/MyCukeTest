Feature: Login
	verify the login functionality
	
Scenario: Login Test scenario
	Given i am on Login page
	When i enter valid login credentials
	Then i should login successfully
	
	

	Scenario: Test the Home page
		Given i am on Login page
		When i enter teh payment information and submit transaction
		Then payment should be successfull
		