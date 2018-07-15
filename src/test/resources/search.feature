Feature: Sputnik search

  Scenario: Validate search results
    Given open site
    And click input
    When enter 'tanks'
    And press Find
    Then results are returned
    And 'tanks' should be in the results list
