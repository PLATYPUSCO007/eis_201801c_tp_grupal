Feature: Gradle-Cucumber integration

  Scenario: Just a failing scenario
    When I run a failing step

  Scenario: Eat a biscuit and win points
    Given an initial state of pacman
    When pacman eat a biscuit
    Then will become fatter


  Scenario: Eat a fruit and win points
    Given an initial state of pacman
    When pacman eat a fruit
    Then will become most fatter

  Scenario: Crash with a phantom and die
    Given a life(s)
    When pac man crash with a phantom
    Then will be die

  Scenario: Pac man eat a pellet and the phantom be weaken
    Given an initial state of pac man
    When pac man eat a pellet
    Then the phantoms be weaken