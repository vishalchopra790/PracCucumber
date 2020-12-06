Feature: User page

  Scenario: User Regiestration
    Given  user is on regiesteration page
    When   user enter the follow details
      | name   | salary | job     |
      | Vishal | 20000  | Tster   |
      | Sagil  | 230000 | hyu     |
      | Rajesh | 345000 | Railway |
    Then  user  regiestered sucessfully