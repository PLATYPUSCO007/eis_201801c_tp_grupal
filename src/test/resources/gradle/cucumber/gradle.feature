Feature: Gradle-Cucumber integration

  Scenario: Just a failing scenario
    When I run a failing step

  Scenario: Eat a biscuit and win points
    Given an initial state of pacman
    When pacman eat a biscuit
    Then will become fatter