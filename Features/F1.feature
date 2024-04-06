#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Feature1
Feature: To test the OPENMRS Application
 
  @SC1
  Scenario: To test the login page of OPENMRS Application
    Given Open the chrome browser and url of application
    When Enter the valid Username and password 
    And click on login button
    Then Login to the Account
    
  @SC1
  Scenario: To test the login page of OPENMRS Application
    Given Open the chrome browser and url of application
    When Enter the invalid Username and password 
    And  click on login button
    Then Error Message to be the display-invalid details
   

  @Sc3
  Scenario Outline: To test the login page of OPENMRS Application
    Given Open the chrome browser and url of application
    When Enter "<username>" & "<password>"
    And click on login button
    Then Login to the Account
    Examples: 
      | username  | password    | 
      | name      |     Aish    | 
      | name2     |     Aish    | 
     
     @SC4
  Scenario: To test the login page of OPENMRS Application
    Given Open the chrome browser and url of application
    When Enter the valid deatils
    | username  | password    | 
    | name      |     Aish    |  
    And  click on login button
    Then Login to the Account
      