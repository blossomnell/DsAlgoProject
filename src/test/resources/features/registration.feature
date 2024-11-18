
Feature: DsAlgo portal registration functionality
Background: user is in the registration page


  
  Scenario Outline: the user tries enters various credential combinations 
    Given the user is in the registration page 
    When the user enters "<username>", "<password>", "<password confirmation>" and clicks Register button
    Then the user gets a message "<output>"

    Examples: 
      |username     |password | password confirmation  |                     output                                |
      |             |         |                        |  Please fill out this field                               |
      | ninja!!!    |         |                        |  Please fill out this field                               |
      | ninja!!!    | ninja   |      java              |  password_mismatch:The two password fields didn’t match   |
      | Ninjasquad  | ninja   |      java              |  password_mismatch:The two password fields didn’t match   |
      |  ninja!!!   | ninja   |     abss@123           |  password_mismatch:The two password fields didn’t match   |
      | Ninjasquad  |abss@123 |    abss@1234           |  password_mismatch:The two password fields didn’t match   |
      | Ninjasquad  |abss@123 |     abss@123           |  New Account Created                                      |
      
