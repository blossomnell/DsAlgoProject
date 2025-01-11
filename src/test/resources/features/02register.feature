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
    When the user enters data from the sheet "<sheetName>" and row <row>
    Then the user gets a message "<output>"
     
     Examples:
       | sheetName |  row  |         output                                           |
       |  Register |   1   |  Please fill out this field.                             |
       |  Register |   2   |  Please fill out this field.                             |
       |  Register |   3   |  Please fill out this field.                             |
       |  Register |   4   |  password_mismatch:The two password fields didn’t match. |
       |  Register |   5   |  password_mismatch:The two password fields didn’t match. |
       |  Register |   6   |  password_mismatch:The two password fields didn’t match. |
       |  Register |   7   |  password_mismatch:The two password fields didn’t match. |
       |  Register |   8   |  New Account Created. You are logged in as Ninjasquad    |
       
      
      