
Feature: User sign in to DsAlgo page and Test the Data Structure Module

Background: The user is on the sign-in page with login credentials

    Given User is in the ds-algo launch page
    When User clicks the Get Started button
    Then login with "Login_Valid" and 1

 # Scenario: Verify that the user is able to navigate to the home page
  #  Given User is in the ds-algo launch page
  #  When User clicks the Get Started button in the launch page
  #  Then User should be able to navigate to the home page

 # Scenario Outline: Verify user enters username and password fields
  #  Given The user clicks the Sign In link
  #  When The user gets data from excel sheet '<Sheetname>' and <RowNumber> for the login page
  #  Then The user is in Home Page

  #  Examples: 
  #    | Sheetname | RowNumber |
   #   | Login     |         5 |

 Scenario: Verify that the user is able to click on Get Started button under Data Structures Introduction section
    Given User is on home page of dsalgo portal after signin
    When User clicks on Get Started button under Data Structures Introduction section
    Then User should be navigated to Data Structures Introduction page

  Scenario: Verify that the user is not able to click on Data Structures dropdown name to navigate to Data Structures-Introduction page
    Given User is on home page of dsalgo portal for checking dropdown selection
    When User clicks on Data Structures dropdown name
    Then User should not be able to click the data structure menu

  Scenario: Verify that Time Complexity link is enabled
    Given User is on home page and clicks on Get Started button under Data Structures Introduction section
    When User checks if Time Complexity link is enabled on data structure introduction page
    
		Then time complexity link should be enabled
		
  Scenario: Verify that the user is able to navigate to Time Complexity page
     Given User is on home page and clicks on Get Started button under Data Structures Introduction section
     When user click on time complexity link
    Then User should navigate to time complexity link

			Scenario: Verify that the user is able to navigate to try editor page
			Given User is on home page and clicks on Get Started button under Data Structures Introduction section
			And User is navtigate to time complexity page
   	 When User click on try here>> button on time complexity page
   	 Then User should navigate to try editor page
    
  Scenario Outline: Verify that the user is able to see output for valid Python code entered
    Given User clicks on data structure introduction page and navigate to try editor after clicking on try here btn
    When User enters valid code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run  button
    Then The user should be able to get an output in the Try Editor screen

    Examples: 
      | Sheetname | RowNumber |
      | TryEditor |         1 |
      
      
      
      Scenario Outline: Verify that the user is able to see for error message for invalid Python code and also when no code is entered
    Given User clicks on data structure introduction page and navigate to try editor after clicking on try here btn
    When User enters invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run  button
    Then The user should be able to get an output in the Try Editor screen

    Examples: 
      | Sheetname | RowNumber |
      | TryEditor |         2 |
      

 
  Scenario: Verify that the user is redirected to Practice Questions page
   	Given User is on home page and clicks on Get Started button under Data Structures Introduction section
   	And User is navtigate to time complexity page
    When User clicks on Practice Questions link
    Then User should be redirected to Practice Questions page

 