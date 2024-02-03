Feature: Submit student registration form
  As a user
  I want to be able to send the registration form
  So that I can enroll in a course

  @RequiredDataOnly
  Scenario: Navigate to Practice Form page

    Given User is on Home page
    When User selects "Forms" card
    And User selects "Practice Form" option from "Forms" nav dropdown
    Then User lands on "Practice Form" page
