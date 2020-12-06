Feature: User

  Scenario: User Regiestration
    Given  user is on regiesteration page
    When   user enter the follow details
      | Vishal | 20000  | Tster   |
      | Sagil  | 230000 | hyu     |
      | Rajesh | 345000 | Railway |
    Then  usre  regiestered sucessfully