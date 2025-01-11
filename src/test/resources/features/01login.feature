Feature: DsAlgo login functionality/validation
Background: the user opens the homepage 

@wip
  Scenario: the user is in the homepage and navigates to the signin page
    Given the user is in the homepage    
    When the user clicks the signin button  
    Then the user is redirected to the login page
   
@wip
  Scenario Outline: the user tries to login with different credentials
   Given the user is in the login page
   When the user enters the data from sheet "<sheetName>" and row <row>
   Then the user gets login message "<output>"
   
   Examples: 
      | sheetName  |  row |      output                   |
      | Login      |   1  | Please fill out this field.   |
      | Login      |   2  | Please fill out this field.   |
      | Login      |   3  | Please fill out this field.   |
      | Login      |   4  | Invalid Username and Password |
      | Login      |   5  | Invalid Username and Password |
      | Login      |   6  | Invalid Username and Password |
      | Login      |   7  | You are logged in             |
     
 @wip
   Scenario: the user tries signout function
     Given the user is logged in
     When the user clicks on Sign out button
     Then the user gets message "Logged out successfully"
