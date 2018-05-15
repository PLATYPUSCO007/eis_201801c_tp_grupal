Feature: Pac man crash with a phantom and die

  Scenario: Crash with a phantom and die
    Given a Pac man with life(s)
    When pac man crash with a phantom
    Then lost a life