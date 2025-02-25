
Feature: User sign in to DsAlgo page and Test the Array Module

  Background: The user is on the sign-in page with login credentials

    Given User is in the ds-algo launch page
    When User clicks the Get Started button
    Then login with "Login_Valid" and 1

  Scenario: Verify that the user is able to click on Get Started button under Array section
    Given User is on the Home page of dsalgo portal
    When User clicks on Get Started button under Array section
    Then User is navigated to Array page

  Scenario: Verify that the user select Arrays option from Data Structures drop-down
    Given User is on the Home page of dsalgo portal
    When User selects Arrays option from Data Structures drop-down
    Then User is navigated to Array page

  Scenario: Verify that the Arrays in Python link is enabled in the Array page
    Given The user is in the Array page after clicking on getstarted btn in array
    And checks whether the Arrays in Python link is enabled
    When The user clicks Arrays in Python link
    Then The user should be able to navigate to Arrays in Python page

  Scenario Outline: Verify that the user is able to see output for valid Python code entered
    Given user is navigate to the tryEditor page after clicking on getstarted btn and then navigate to Implementation of Array module
    When The user enter the valid pythoncode input from sheet '<Sheetname>' and <RowNumber> in Array module and clicks on run button
    Then The user checks output in the console output

    Examples: 
      | Sheetname | RowNumber |
      | Array     |         3 |
     
      
    Scenario Outline: Verify that the user is able to see error message forinvalid Python code is entered
   Given user is navigate to the tryEditor page after clicking on getstarted btn and then navigate to Implementation of Array module
    When The user enter the invalid pythoncode input from sheet '<Sheetname>' and <RowNumber> in Array module and clicks on run button
    Then The user checks output in the console output

    Examples: 
      | Sheetname | RowNumber |
      | Array     |         2 |

    Scenario: Verify that the user is able to navigate to Arrays using List page.
    Given The user is in the Array page after clicking on getstarted btn in array
    When The user clicks Arrays using List link
    Then The user should be able to navigate to Arrays using List page

  Scenario Outline: Verify that the user is able to see output for valid Python code and error message for invalid Python code and also when no code is entered
     Given user is navigate to the tryEditor page after clicking on getstarted btn and then navigate to Array using list
    When  The user enter the valid pythoncode input from sheet '<Sheetname>' and <RowNumber> in Array module and clicks on run button
    Then The user checks output in the console output in Array module

    Examples: 
      | Sheetname | RowNumber |
      | Array     |         4 |
      
      
    Scenario Outline: Verify that the user is able to see output for valid Python code and error message for invalid Python code and also when no code is entered     Given user is navigate to the tryEditor page after clicking on getstarted btn and then navigate to Array using list
     Given user is navigate to the tryEditor page after clicking on getstarted btn and then navigate to Array using list
    When The user enter the invalid pythoncode input from sheet '<Sheetname>' and <RowNumber> in Array module and clicks on run button
    Then The user checks output in the console output in Array module

    Examples: 
      | Sheetname | RowNumber | 
      | Array     |         5 |
  Scenario: Verify that the user is able to navigate to Try Here >>> page for Basic Operations in Lists page
    Given The user is in the Array page after clicking on getstarted btn in array
    When user click on basic operation link
    Then The user should be able to navigate to Basic Operations in Lists page

  Scenario Outline: Verify that the user is able to see output for valid Python code is entered
      Given The user is in the Array page after clicking on getstarted btn in array and navigate to Basic Operations in Lists page
    When The user enter the valid pythoncode input from sheet '<Sheetname>' and <RowNumber> in Array module and clicks on run button
    Then The user checks output in the console

    Examples: 
      | Sheetname | RowNumber |
      | Array     |         6 |
     
 Scenario Outline: Verify that the user is able to see output for valid Python code is entered
      Given The user is in the Array page after clicking on getstarted btn in array and navigate to Basic Operations in Lists page
    When The user enter the invalid pythoncode input from sheet '<Sheetname>' and <RowNumber> in Array module and clicks on run button
    Then The user checks output in the console

    Examples: 
      | Sheetname | RowNumber |
      | Array     |         7 |

  Scenario Outline: Verify that the user is able to see output for valid Python code and error message for invalid Python code and also when no code is entered
    Given The user is in the Array page after clicking on getstarted btn in array and navigate to the Applications of Array in Lists page
    When The user enter the valid pythoncode input from sheet '<Sheetname>' and <RowNumber> in Array module and clicks on run button
    Then The user checks output in the console output

    Examples: 
      | Sheetname | RowNumber |
      | Array     |         6 |
     

Scenario Outline: Verify that the user is able to see output for valid Python code and error message for invalid Python code and also when no code is entered
    Given The user is in the Array page after clicking on getstarted btn in array and navigate to the Applications of Array in Lists page
    When The user enter the invalid pythoncode input from sheet '<Sheetname>' and <RowNumber> in Array module and clicks on run button
    Then The user checks output in the console output

    Examples: 
      | Sheetname | RowNumber |
      | Array     |         5 |

 Scenario: Verify user is able to navigate to Practice Questions page after clicking practice question link
    Given The user is in the Array page after clicking on getstarted btn in array for practice question
    When The user clicks Pactice Question link
    Then The user should be able to navigate to practice question page

  Scenario: Verify that user is able to navigate to Search the array Page from Practice question page of Arrays in Python page
    Given The user is in the Array page after clicking on getstarted btn and navigate to Practice Questions editor page
    When The user clicks Search the array Page link
    Then The user should be able to navigate to the array Page link

  Scenario Outline: Verify that user receives success on submitting  python code for Search the array question
    Given The user navigate from getstarted btn to the search the array page
    When The user enter the valid pythoncode input from sheet '<Sheetname>' and <RowNumber> in Array module and clicks on run button
    Then The user get an output

    Examples: 
      | Sheetname | RowNumber |
      | Array     |         3 |
    
    Scenario Outline: Verify that user receives success on submitting  python code for Search the array question
    Given The user navigate from getstarted btn to the search the array page
    When The user enter the invalid pythoncode input from sheet '<Sheetname>' and <RowNumber> in Array module and clicks on run button
    Then The user get an output

    Examples: 
      | Sheetname | RowNumber |
      | Array     |         4 |

  Scenario: Verify whether the user is able to click on Max Consecutive Ones link and navigate to Max Consecutive Ones page
   Given The user is in the Array page after clicking on getstarted btn and navigate to Practice Questions editor page
    When The user click on Max Consecutive Ones link
    Then The user should be able to navigate to Max Consecutive Ones

  Scenario Outline: Verify that user is able to run valid python code for Max Consecutive Ones page
    Given The user navigate from getstarted btn for the try here page of Max Consecutive Ones page
    When The user enter the valid pythoncode input from sheet '<Sheetname>' and <RowNumber> in Array module and clicks on run button
    Then The user should able to see output in the console

    Examples: 
      | Sheetname | RowNumber |
      | Array     |         7 |

  
  Scenario: Verify whether the user is able to click Find Numbers with Even Number of Digits Page and navigate to page
    Given The user navigate from get started btn in array page to the Practice Questions page
    When The user click on Find Numbers with Even Number of Digits link
    Then The user should be able to navigate to try here of Find Numbers with Even Number of Digits page

  Scenario Outline: Verify that user receives error for invalid python code with incorrect syntax on running Find Numbers with Even Number of Digits question
    Given The user navigate from getstarted btn for the try here page of Find Numbers with Even Number of Digits
    When The user enter the valid pythoncode input from sheet '<Sheetname>' and <RowNumber> in Array module and clicks on run button
    Then The user should able to see the output

    Examples: 
      | Sheetname | RowNumber |
      | Array     |        9  |
      
    Scenario Outline: Verify that user receives error for invalid python code with incorrect syntax on running Find Numbers with Even Number of Digits question
    Given The user navigate from getstarted btn for the try here page of Find Numbers with Even Number of Digits
    When The user enter the invalid pythoncode input from sheet '<Sheetname>' and <RowNumber> in Array module and clicks on run button
    Then The user should able to see the output

    Examples: 
      | Sheetname | RowNumber |
      | Array     |        9  |


  Scenario: Verify that user receives error on submitting empty python code for Find Numbers with Even Number of Digits question
    When The user clicks the Submit Button without entering the code in the Editor
    Then The user should  see an error message

  Scenario: Verify whether the user is able to click to Squares of a Sorted Array Page
    Given The user navigate from get started btn in array page to the Practice Questions page
    When The user click on  the Squares of a Sorted Array Page
    Then The user should be able to navigate to try here Squares of a Sorted Array Page

  Scenario Outline: Verify that user is able to run valid python code for Squares of a Sorted Array question
   Given The user navigate from getstarted btn for the try here page of a Sorted Array question
    When The user write the valid code input from  sheet '<Sheetname>' and <RowNumber> and click on run button
    Then The user should able to see an error message

    Examples: 
      | Sheetname | RowNumber |
      | Array     |        11 |
      

  Scenario: Verify that user does not receives error when click on Run button without entering code for Squares of a Sorted Array page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should be able to see an empty window

 