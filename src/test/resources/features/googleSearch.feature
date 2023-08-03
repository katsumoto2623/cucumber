Feature: Google search functionality
  Agile story : As a user, when I am on the google search page
  I should be able to search whatever I want to see relevant information

  Background: The user should be on the login page


  Scenario: Search page title verification
    When user is on Google search page
    Then user should see title is Google

  Scenario: Google Search Functionality Title Verification
    Given user is on Google search page
    When user types apple in the google search box and clicks enter
    Then user sees Steve Jobs is in the google title

