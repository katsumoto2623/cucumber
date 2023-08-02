@Regression
Feature: Library app login feature
  As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.
  Accounts are: librarian, student, admin

  @librarian @employee
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

  @student
  Scenario: Login as student
    When user enters student username
    And user enters student password
    Then user should see the dashboard

  @admin @employee
  Scenario: Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard

    #This is how we add comment to feature