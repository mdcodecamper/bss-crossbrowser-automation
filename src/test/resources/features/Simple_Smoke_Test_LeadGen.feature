@Simple_SmokeTest_LeadGen
Feature: I want to perform a simple smoke test for leadgen in prod

  Scenario: As a user i want to test leadGen so that i can get thank you page after entering Email

#    Given user count all record from database for a specific email
    And User navigate to LeadGen in Prod
    When User enter Email
    And User Click on Submit button
    Then User verify that thankyou page is displayed
    And User close the browser