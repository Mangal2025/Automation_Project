@RetailPage
Feature: Retail Page: for this feature you have to have an existing account

  Background: 
 	 Given User is on Retail website

  @LoginToAccountDashboard
  Scenario: Login to My Account Dashboard
    
    When User click  Log in 
    Then User enter username 'userName'
    And  User enter password 'passWord'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  
