Feature: Array page functionality
Background: the user is already signed in

  @tag1
  Scenario: exploring the Array page
    Given the user is in the Homepage   
    When the user clicks the Get Started button under Array    
    Then the user should be in the Array page
   
  @tag2
  Scenario: exploring the Arrays in Python page
    Given the user is in the Array page
    When the user clicks the Arrays in Python button
    Then the user should be in the Arrays in Python page

  @tag3
  Scenario: exploring the python editor page
    Given the user is in the Arrays in Python page
    When the user scrolls down and clicks the Try here button
    Then the user should be in the Python editor page 
    
  @tag4
  Scenario: validating the Run button with empty code
    Given the user is in the Python editor page 
    When the user leaves the editor empty and clicks Run button
    Then no action occurred in the page and no error message is displayed
    
  @tag5
  Scenario: validating Run function with invalid code
    Given the user is in the Python editor page 
    When the user enters invalid code in the editor and clicks Run button
    Then the user should see an error message on top of the page    

  @tag6
  Scenario: validating Run function with valid code
    Given the user is in the Python editor page 
    When the user enters valid code in the editor and clicks Run button
    Then the user is able to see the output in the console 
    
  @tag7
  Scenario: exploring the Arrays Using List page
    Given the user is in the Arrays in Python page
    When the user clicks the Arrays Using List button
    Then the user should be in the Arrays Using List page   

  @tag8
  Scenario: exploring the python editor page
    Given the user is in the Arrays Using List page
    When the user clicks the Try here button at the bottom of the page
    Then the user should be in the Python editor page  

  @tag9
  Scenario: validating Run function with empty code
    Given the user is in the Python editor page
    When the user leaves the editor empty and clicks Run button
    Then no action occurred in the page and no error message is displayed
    
  @tag10
  Scenario: validating Run function with invalid code
    Given the user is in the Python editor page
    When the user enters invalid code in the editor and clicks Run button
    Then the user should see an error message on top of the page   

  @tag11
  Scenario: validating Run function with valid code
    Given the user is in the Python editor page
    When the user enters valid code in the editor and clicks Run button
    Then the user is able to see the output in the console 
    
  @tag12
  Scenario: exploring the Basic Operations in Lists page
    Given the user is in the Arrays Using List page
    When the user clicks the Basic Operations in Lists button
    Then the user should be in the Basic Operations in Lists page
    
  @tag13
  Scenario: exploring the python editor page
    Given the user is in the Basic Operations in Lists page
    When the user clicks the Try here button at the bottom of the page
    Then the user should be in the Python editor page 
    
  @tag14
  Scenario: validating Run function with empty code
    Given the user is in the Python editor page 
    When the user leaves the editor empty and clicks Run button
    Then no action occurred in the page and no error message is displayed
   
  @tag15
  Scenario: validating Run function with invalid code
    Given the user is in the Python editor page 
    When the user enters invalid code in the editor and clicks Run button
    Then the user should see an error message on top of the page 
   
  @tag16
  Scenario: validating Run function with valid code
    Given the user is in the Python editor page
    When the user enters valid code in the editor and clicks Run button
    Then the user is able to see the output in the console 

  @tag17
  Scenario: exploring the Applications of Array page
    Given the user is in the Basic Operations in Lists page
    When the user clicks the Applications of Array button
    Then the user should be in the Applications of Array page

  @tag18
  Scenario: exploring the python editor page
    Given the user is in the Applications of Array page
    When the user clicks the Try here button at the bottom of the page
    Then the user should be in the Python editor page 

  @tag19
  Scenario: validating Run function with empty code
    Given the user is in the Python editor page 
    When the user leaves the editor empty and clicks Run button
    Then no action occurred in the page and no error message is displayed    

  @tag20
  Scenario: validating Run function with invalid code
    Given the user is in the Python editor page  
    When the user enters invalid code in the editor and clicks Run button
    Then the user should see an error message     

  @tag21
  Scenario: validating Run function with valid code
    Given the user is in the Python editor page
    When the user enters valid code in the editor and clicks Run button
    Then the user is able to see the output in the console    

  @tag22
  Scenario: exploring the Practice Questions Page
    Given the user is back in the Applications of Array page
    When the user clicks the Practice Questions button
    Then the user should be in the Practice Questions button    

  @tag23
  Scenario: exploring the Search the Array page
    Given the user is in the Practice Questions button
    When the user clicks on Search the Array button
    Then the user is redirected to the python editor page
    
  @tag24
  Scenario: validating Run function with empty code
    Given the user is in the Python editor page
    When the user leaves the editor empty and clicks Run button
    Then the user should see an error message 
   
  @tag25
  Scenario: validating Run function with invalid code
    Given the user is in the Python editor page
    When the user enters invalid code in the editor and clicks Run button
    Then no action occurred in the page and no error message is displayed
   
  @tag26
  Scenario: validating Run function with valid code
    Given the user is in the Python editor page
    When the user enters valid code in the editor and clicks Run button
    Then the user is able to see the output in the console
   
  @tag27
  Scenario: validating Submit function with valid code
    Given the user is in the Python editor page with the output 
    When the user clicks on the Submit button
    Then the user should see an error message
  
  @tag28
  Scenario: exploring the Max Consecutive Ones page
    Given the user is in the Practice Questions page 
    When the user clicks the Max Consecutive Ones button
    Then the user should be in the Python editor page 
    
  @tag29
  Scenario: validating the Run function with empty code
    Given the user is in the Python editor page 
    When the user leaves the editor empty and clicks Run button
    Then the user should see an error message  
    
  @tag30
  Scenario: validating the Run function with invalid code
    Given the user is in the Python editor page
    When the user enters invalid code in the editor and clicks Run button
    Then no action occurred in the page and no error message is displayed
   
  @tag31
  Scenario: validating the Run function with valid code
    Given the user is in the Python editor page
    When the user enters valid code in the editor and clicks Run button
    Then the user is able to see the output in the console
    
  @tag32
  Scenario: validating the Submit function with valid code
    Given the user is in the Python editor page with the output
    When the user clicks the Submit button
    Then the user should see an error message 
   
  @tag33
  Scenario: exploring the Find Numbers with Even Number of Digits page
    Given the user is in the Practice Questions page
    When the user clicks on the Find Numbers with Even Number of Digits
    Then the user is redirected to the python editor page   

  @tag34
  Scenario: validating Run function with empty code
    Given the user is in the Python editor page
    When the user leaves the editor empty and clicks Run button
    Then the user should see an error message 
    
  @tag35
  Scenario: validating Run function with invalid code
    Given the user is in the Python editor page
    When the user enters invalid code in the editor and clicks Run button
    Then no action occurred in the page and no error message is displayed   

  @tag36
  Scenario: validating Run function with valid code
    Given the user is in the Python editor page
    When the user enters valid code in the editor and clicks Run button
    Then the user is able to see the output in the console
   
  @tag37
  Scenario: validating Submit function with valid code
    Given the user is in the Python editor page with the output
    When the user clicks Submit button
    Then the user should see an error message 
       
  @tag38
  Scenario: exploring the Squares of Sorted Array page
    Given the user is in the Practice Questions page
    When the user clicks the Squares of a Sorted Array
    Then the user is redirected to the python editor page
    
  @tag39
  Scenario: validating Run function with empty code
    Given the user is in the Python editor page
    When the user leaves the editor empty and clicks Run button
    Then the user see an error message 
    
  @tag40
  Scenario: validating Run function with invalid code
    Given the user is in the Python editor page
    When the user enters invalid code in the editor and clicks Run button
    Then no action occurred in the page and no error message is displayed

  @tag41
  Scenario: validating Run function with valid code
    Given the user is in the Python editor page
    When the user enters valid code in the editor and clicks Run button
    Then the user is able to see the output in the console

  @tag42
  Scenario: validating Submit function with valid code
    Given the user is in the Python editor page with the output
    When the user clicks Submit 
    Then the user see an error message



