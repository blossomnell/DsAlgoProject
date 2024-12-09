Feature: user actions on queue pages

  Background: 
    Given the user is logged in

  Scenario: Navigate to queue page
  Given the user is in the homepage
  When the user clicks on the Get started button under queue
  Then the user navigates to the queue page
  #
  Scenario: Navigate to Operations in queue page
  Given the user in th queue page
  When the user clicks on the Implementation of Queue in Python link
  Then the user navigates to the Implementation of Queue in Python page
  
  Scenario: Navigate to try editor page
  Given the user in Implementation of Queue in Python page
  When the user scroll down and clicks try here button
  Then the user navigates to try editor page
  
  Scenario Outline: Run code in the Python Editor
  Given the user is in the try editor page in Implementation of Queue in Python
  When the user enters '<code>' in the editor and clicks Run button
  Then the user sees "<expectedOutcome>"
  
  Examples:
  | code                  | expectedOutcome                                   |
  | print(\\"Hello\\")abc | popup error message containing SyntaxError        |
  | print(\\"Hello123\\")    | the user is able to see the output in the console |
  
  
  Scenario: navigates to Implementation using collections.deque page
    Given the user in th queue page
    When the user clicks on the Implementation using collections.deque link
    Then the user navigates to the Implementation using collections.deque page

  Scenario: Navigate to try editor page
    Given the user in Implementation using collections.deque page
    When the user scroll down and clicks try here button
    Then the user navigates to try editor page

  Scenario Outline: Run code in the Python Editor
    Given the user is in the try editor page in Implementation using collections.deque
    When the user enters "<code>" in the editor and clicks Run button
    Then the user sees "<expectedOutcome>"

    Examples: 
      | code                  | expectedOutcome                                   |
      | print(\\"Hello\\")abc | popup error message containing SyntaxError        |
      | print(\\"Hello\\")    | the user is able to see the output in the console |
      
      
    Scenario: navigates to Implementation using array page
    Given the user in th queue page
    When the user clicks on the Implementation using array link
    Then the user navigates to the Implementation using array page

  Scenario: Navigate to try editor page
    Given the user in Implementation using array page
    When the user scroll down and clicks try here button
    Then the user navigates to try editor page

  Scenario Outline: Run code in the Python Editor
    Given the user is in the try editor page in Implementation using array
    When the user enters "<code>" in the editor and clicks Run button
    Then the user sees "<expectedOutcome>"

    Examples: 
      | code                  | expectedOutcome                                   |
      | print(\\"Hello\\")abc123 | popup error message containing SyntaxError        |
      | print(\\"Hello\\")    | the user is able to see the output in the console |
       Scenario: navigates to Queue Operations page
    Given the user in th queue page
    When the user clicks on the Queue Operations link
    Then the user navigates to the Queue Operations page

  Scenario: Navigate to try editor page
    Given the user in Queue Operations page
    When the user scroll down and clicks try here button
    Then the user navigates to try editor page

  Scenario Outline: Run code in the Python Editor
    Given the user is in the try editor page in Queue Operations
    When the user enters "<code>" in the editor and clicks Run button
    Then the user sees "<expectedOutcome>"

    Examples: 
      | code                  | expectedOutcome                                   |
      | print(\\"Hello\\")abc | popup error message containing SyntaxError        |
      | print(\\"Hello\\")    | the user is able to see the output in the console |
      
    Scenario: Navigate to Practice questions page
    Given the user in operations in queue page
    When the user clicks on the Practice questions link
    Then the user navigates to the Practice page