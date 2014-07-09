Feature: Learn Cucumber
  As a software developer
  I want to learn Cucumber
  So that I can develop in BDD style

  Scenario: Write Hello World cucumber
    Given I have a Java project
    When I write a Hello World Cucumber test
    Then I should be able to run it and see "Hello World" printed on screen

  Scenario:
    Given I have 48 cukes in my belly


  Scenario:
    Given the following users exist:
      | name  | email           | phone |
      | Aslak | aslak@email.com | 123   |
      | Matt  | matt@email.com  | 234   |
      | Joe   | joe@email.org   | 456   |