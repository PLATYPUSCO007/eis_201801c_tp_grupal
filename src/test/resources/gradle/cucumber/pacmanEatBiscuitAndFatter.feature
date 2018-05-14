Feature: Pac man eat biscuit

  Scenario: Eat a biscuit and win points
    Given an pac man and a biscuit
    When pacman eat a biscuit
    Then will become fatter