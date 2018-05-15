Feature: pacman eat pallet

  Scenario: Eat a pallet and phantom weak
    Given an pacman and a pallet
    When pacman eat a pallet
    Then phantom weak