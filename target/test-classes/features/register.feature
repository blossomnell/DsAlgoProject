
Feature: DsAlgo portal registration functionality
Background: user is in the registration page

@wip
  Scenario: the user is in the homepage and navigates to the registration page
    Given the user is in homepage    
    When the user clicks the Register  
    Then the user is redirected to the register page
    
@wip
  Scenario Outline: the user tries enters various credential combinations 
    Given the user is in the registration page 
    When the user enters "<username>", "<password>", "<password confirmation>" and clicks Register button
    Then the user gets a message "<output>"

    Examples: 
      |username     |password  | password confirmation  |                     output                                |
      |             |          |                        |  Please fill out this field.                              |
      | ninja!!!    |          |                        |  Please fill out this field.                              |     
      |             |javajava  |  javajava              |  Please fill out this field.                              |
      | ninja!!!    | ninja    |      java              |  password_mismatch:The two password fields didn’t match.  |
      | Ninjasquad  | ninja    |      java              |  password_mismatch:The two password fields didn’t match.  |
      |  ninja!!!   | ninja    |     abss@123           |  password_mismatch:The two password fields didn’t match.  |
      | Ninjasquad  |abss@123  |    abss@1234           |  password_mismatch:The two password fields didn’t match.  |
      | Ninjasquad  |abss@1234 |     abss@1234          |  New Account Created. You are logged in as Ninjasquad     |
      
      
