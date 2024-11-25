Feature: Linked List functionality
Background: the user is already signed in

  @wip
  Scenario: exploring the Linked List page
    Given the user is in the DsAlgo homepage
    When the user clicks the Get Started button under Linked List
    Then the user should be in the Linked List page

  @wip
  Scenario: exploring the Introduction page
    Given the user is in the Linked List page
    When the user clicks the Introduction button
    Then the user should be in the Introduction page

  @tag3
  Scenario: exploring the python editor page
    Given the user is in the Introduction page
    When the user clicks the Try here button
    Then the user should be in the python page

  @tag4
  Scenario: validating Run function with empty code
    Given the user is in the python page
    When the user leaves the python editor empty and clicks Run
    Then no action occurred in the page

  @tag5
  Scenario: validating Run function with invalid code
    Given the user is in the python page
    When the user enters a invalid code in the python editor and clicks Run
    Then user should see an error message

  @tag6
  Scenario: validating Run function with valid code
    Given the user is in the python page
    When the user enters a valid code in the python editor and clicks Run
    Then the user should see the output in the console

  @tag7
  Scenario: exploring the Creating Linked List page
    Given the user is back in the introduction page
    When the user clicks on the Creating Linked List button
    Then the user should be in the Creating Linked List page

  @tag8
  Scenario: exploring the python editor page
    Given the user is in the Creating Linked List page
    When the user clicks Try here button
    Then the user should be in the python editor page

  @tag9
  Scenario: validating Run function with empty code
    Given the user is in the python editor page
    When the user leaves the python editor empty and clicks Run
    Then no action occurred in the page

  @tag10
  Scenario: validating Run function with invalid code
    Given the user is in the python editor page
    When the user enters an invalid code in the python editor and clicks Run
    Then an error message is shown

  @tag11
  Scenario: validating Run function with valid code
    Given the user is in the python editor page
    When the user enters a valid code in the python editor and clicks Run
    Then the user should see the output in the console

  @tag12
  Scenario: exploring the Types of Linked List page
    Given the user is in the Creating Linked List page
    When the user clicks on Types of Linked List button
    Then the user should be in the Types of Linked List page

  @tag13
  Scenario: exploring the python editor page
    Given the user is on the Types of Linked List page
    When the user clicks the Try here button
    Then the user should be in the python editor page

  @tag14
  Scenario: validating Run function with empty code
    Given the user is in the python editor page
    When the user leaves the python editor empty and clicks Run
    Then no action occurred in the page

  @tag15
  Scenario: validating Run function with invalid code
    Given the user is in the python editor page
    When the user enters an invalid code in the python editor and clicks Run
    Then an error message is shown

  @tag16
  Scenario: validating Run function with valid code
    Given the user is in the python editor page
    When the user enters an valid code in the python editor and clicks Run
    Then the user should see the output in the console

  @tag17
  Scenario: exploring the Implement Linked List in Python page
    Given the user is on the Types of Linked List page
    When the user clicks the Implement Linked List in Python
    Then the user should be in the Implement Linked List in Python page

  @tag18
  Scenario: exploring the python editor page
    Given the user is in the Implement Linked List in Python page
    When the user clicks the Try here button
    Then the user should be in the python editor page

  @tag19
  Scenario: validating Run function with empty code
    Given the user is in the python editor page
    When the user leaves the python editor empty and clicks Run
    Then no action occurred in the page

  @tag20
  Scenario: validating Run function with invalid code
    Given the user is in the python editor page
    When the user enters an invalid code in the python editor and clicks Run
    Then an error message is shown

  @tag21
  Scenario: validating Run function with valid code
    Given the user is in the python editor page
    When the user enters a valid code in the python editor and clicks Run
    Then the user should see the output in the console

  @tag22
  Scenario: exploring the Traversal page
    Given the user is in the Implement Linked List in Python page
    When the user clicks the Traversal
    Then the user should be in the traversal page

  @tag23
  Scenario: exploring the python editor page
    Given the user is in the traversal page
    When the user clicks the Try here button
    Then the user should be in the python editor page

  @tag24
  Scenario: validating Run function with empty code
    Given the user is in the python editor page
    When the user leaves the python editor empty and clicks Run
    Then no action occurred in the page

  @tag25
  Scenario: validating Run function with invalid code
    Given the user is in the python editor page
    When the user enters an invalid code in the pyton editor and clicks Run
    Then an error message is shown

  @tag26
  Scenario: validating Run function with valid code
    Given the user is in the python editor page
    When the user enters an valid code in the python editor and clicks Run
    Then the user should see the output in the console

  @tag27
  Scenario: exploring the Insertion page
    Given the user is back in the Traversal page
    When the user clicks the Insertion button
    Then the user should be in the Insertion page

  @tag28
  Scenario: exploring the python editor page
    Given the user is in the Insertion page
    When the user clicks Try here button
    Then the user should be in the python editor page

  @tag29
  Scenario: validating Run function with empty code
    Given the user is in the python editor page
    When the user leaves the python editor empty and clicks Run
    Then no action occurred in the page

  @tag30
  Scenario: validating Run function with invalid code
    Given the user is in the python editor page
    When the user enters an invalid code in the python editor and clicks Run
    Then an error message is shown

  @tag31
  Scenario: validating Run function with valid code
    Given the user is in the python editor page
    When the user enters a valid code in the python editor and clicks Run
    Then the user should see the output in the console

  @tag32
  Scenario: exploring the Deletion page
    Given the user is in the Insertion page
    When the user clicks the Deletion button
    Then the user should be in the Deletion page

  @tag33
  Scenario: exploring the python editor page
    Given the user is in the Deletion page
    When the user clicks Try here button
    Then the user should be in the python editor page

  @tag34
  Scenario: validating Run function with empty code
    Given the user is in the python editor page
    When the user leaves the python editor empty and clicks Run
    Then no action occurred in the page

  @tag35
  Scenario: validating Run function with invalid code
    Given the user is in the python editor page
    When the user enters an invalid code in the python editor and clicks Run
    Then an error message is shown

  @tag36
  Scenario: validating Run function with valid code
    Given the user is in the python editor page
    When the user enters a valid code in the python editor and clicks Run
    Then the user should see the output in the console

  @tag37
  Scenario: exploring the practice questions page
    Given the user is in the Deletion page
    When the user clicks the practice question
    Then the user should see the blank Practice Questions page