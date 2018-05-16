Feature: Pacman crash with a phantom without Body and not die

  Scenario: Crash with a without Body and not die
    Given a Pacman and a Phanton
    When pac man crash with a phantom without Body
    Then pacman not die