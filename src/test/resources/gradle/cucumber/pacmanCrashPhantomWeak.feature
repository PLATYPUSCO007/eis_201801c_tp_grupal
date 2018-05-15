Feature: Pac man crash with a phantom and not die

  Scenario: Crash with a phantom and not die and
    Given a Pac and Phantom weak
    When pac man crash with a phantom weak
    Then not die and eat the Phantom isn't body