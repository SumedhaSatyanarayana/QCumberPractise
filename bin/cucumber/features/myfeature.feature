Feature: Proof of concept that my framework works

  Scenario: Free CRM login test scenario
    Given User is already on Login Page
    When Title of login page is Free CRM
     And User clicks on Login button
    Then User enters username and password
   
# Given - scope of test eg, open a website
# When  - click on adoption link , can have multiple option,
# Then  - check that "Sry animal not available " message in website 
# And   - can be put anywhere, depends on scenarios
