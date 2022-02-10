
Feature: Birthing

  Scenario: If age of Cows is valid 	
    Given Cows are alowed to have a child
    When Mother is over 2 year age
    And father is over 2 year age
    And Mother is pregnant over 10 month
    Then Birth is successful.
