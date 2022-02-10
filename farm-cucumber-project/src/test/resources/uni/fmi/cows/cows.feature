Feature: Birthing

  Scenario: If age of Cows is valid 	
    Given Cows are allowed to have a child
    When Mother is over 2 year age
    And Father is over 2 year age
    And Mother is pregnant over 10 month
    Then Birth is successful.
    
    Scenario: If Mother is younger then 2 year 	
    Given Cows are allowed to have a child
    When Mother is under 2 year age
    And Father is over 2 year age
    And Mother can not be pregnant
    Then Birth is not allowed.
    
    Scenario: If Father is younger then 2 year 	
    Given Cows are allowed to have a child
    When Mother is over 2 year age
    And Father is under 2 year age
    And Mother can not be pregnant
    Then Birth is not allowed.
    
    Scenario: If Mother pregnanting under 10 month
    Given Cows are allowed to have a child
    When Mother is over 2 year age
    And Father is over 2 year age
    And Mother is pregnant under 10 month
    Then Birth is not successful.
    
    Scenario: If Mother and Father are younger then 2 year 	
    Given Cows are allowed to have a child
    When Mother is under 2 year age
    And Father is under 2 year age
    And Mother can not be pregnant
    Then Birth is not allowed.
