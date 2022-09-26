Feature: Logout
  As a user
  I want to logout
  So I can login again

  Scenario: Success logout
    Given I have logged in
    When I click logout button
    Then I will go to login page