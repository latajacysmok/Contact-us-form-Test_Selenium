@scenario
Feature: Filling out the form and sending using "Contact us".

  Scenario Outline: Verification of the application form "Contact us"
    Given I navigate to "http://automationpractice.com/" using "<browser>"
    When  I click "Contact us" button
    And Fill filling out the application form
    Then I can send message

    Examples:
      |browser|
      |CHROME |
      #|FIREFOX|