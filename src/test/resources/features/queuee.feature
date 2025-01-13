
Feature: user actions on queue pages

  Background: 
    Given the user is logged in

  @tag
  Scenario: Navigate to queue page
    Given the user is in the homepage
    When the user clicks on the Get started button under queue
    Then the user navigates to the queue page

  @tag
  Scenario: Navigate to Operations in queue page
    Given the user in th queue page
    When the user clicks on the Implementation of Queue in Python link
    Then the user navigates to the Implementation of Queue in Python page

  @tag
  Scenario: Navigate to try editor page
    Given the user in Implementation of Queue in Python page
    When the user scroll down and clicks try here button
    Then the user navigates to try editor page

  @tag
  Scenario Outline: Run code in the Python Editor
    Given the user is in the Python try editor page
    When the user enters data from excel sheet "<sheetName>" and row <row>
    Then the user sees the expected outcome from excel sheet "<sheetName>" and row <row>

    Examples: 
      | sheetName | row |
      | python DS |   1 |
      | python DS |   2 |

  @tag
  Scenario: navigates to Implementation using collections.deque page
    Given the user in th queue page
    When the user clicks on the Implementation using collections.deque link
    Then the user navigates to the Implementation using collections.deque page

  @tag
  Scenario: Navigate to try editor page
    Given the user in Implementation using collections.deque page
    When the user scroll down and clicks try here button
    Then the user navigates to try editor page

  @tag
  Scenario Outline: Run code in the Python Editor
    Given the user is in the Python try editor page
    When the user enters data from excel sheet "<sheetName>" and row <row>
    Then the user sees the expected outcome from excel sheet "<sheetName>" and row <row>

    Examples: 
      | sheetName | row |
      | python DS |   1 |
      | python DS |   2 |

  @tag
  Scenario: navigates to Implementation using array page
    Given the user in th queue page
    When the user clicks on the Implementation using array link
    Then the user navigates to the Implementation using array page

  @tag
  Scenario: Navigate to try editor page
    Given the user in Implementation using array page
    When the user scroll down and clicks try here button
    Then the user navigates to try editor page

  @tag
  Scenario Outline: Run code in the Python Editor
    Given the user is in the Python try editor page
    When the user enters data from excel sheet "<sheetName>" and row <row>
    Then the user sees the expected outcome from excel sheet "<sheetName>" and row <row>

    Examples: 
      | sheetName | row |
      | python DS |   1 |
      | python DS |   2 |

  @tag
  Scenario: navigates to Queue Operations page
    Given the user in th queue page
    When the user clicks on the Queue Operations link
    Then the user navigates to the Queue Operations page

  @tag
  Scenario: Navigate to try editor page
    Given the user in Queue Operations page
    When the user scroll down and clicks try here button
    Then the user navigates to try editor page

  @tag
  Scenario Outline: Run code in the Python Editor
    Given the user is in the Python try editor page
    When the user enters data from excel sheet "<sheetName>" and row <row>
    Then the user sees the expected outcome from excel sheet "<sheetName>" and row <row>

    Examples: 
      | sheetName | row |
      | python DS |   1 |
      | python DS |   2 |

  @tag
  Scenario: Navigate to Practice questions page
    Given the user in operations in queue page
    When the user clicks on the Practice questions link
    Then the user navigates to the Practice page
