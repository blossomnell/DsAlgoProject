

Feature: DsAlgo login functionality/validation
Background: the user opens the homepage page

 
  Scenario: the user is in the homepage and navigates to the signin page
    Given the user is in the homepage    
    When the user clicks the signin button  
    Then the user is redirected to the login page
    

@wip
  Scenario Outline: the user tries to login with different credentials
    Given the user is in the login page      
    When the user enters "<username>" and  "<password>" and clicks login button
    Then the user gets login message "<output>"
    
    Examples: 
      |username    |password  | output                        |
      |            |          | Please fill out this field.   |
      |            | abss@abc | Please fill out this field.   |
      | Ninjasquad | 				  | Please fill out this field.   |
      | Ninjasquad | abss     | Invalid Username and Password |
      |  ninja     |abss@abc  | Invalid Username and Password |
      |  ninja     | abss     | Invalid Username and Password |
      | Ninjasquad | abss@123 | You are logged in             |
