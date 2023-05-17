Feature: registerPage

  @registerPage
  Scenario: As a user, I should able to register successfully
  So that, I can use all user features

    Given I am on register Page
    When I enter registration details
    Then I should able to register successfully
