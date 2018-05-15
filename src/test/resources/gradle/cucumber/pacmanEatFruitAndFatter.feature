Feature: Pac man eat fruit

  Scenario: Eat a fruit and win points
    Given an pac man and a fruit
    When pacman eat a fruit
    Then  become fatter