Feature: user actions on stack pages

  Background: 
    Given the user is logged in

  @tag
  Scenario: Navigate to Stack page
    Given the user is in the homepage
    When the user clicks on the Get started button under stack
    Then the user navigates to the Stack page

  @tag
  Scenario: Navigate to Operations in Stack page
    Given the user in th stack page
    When the user clicks on the Operations in Stack link
    Then the user navigates to the Operations in Stack page

  @tag
  Scenario: Navigate to try editor page
    Given the user in operations in Stack page
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
  Scenario: navigates to Implementation page
    Given the user in th stack page
    When the user clicks on the Implementation link
    Then the user navigates to the Implementation page

  @tag
  Scenario: Navigate to try editor page
    Given the user in Implementation page
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
  Scenario: navigates to Applications page
    Given the user in th stack page
    When the user clicks on the Applications link
    Then the user navigates to the Applications page

  @tag
  Scenario: Navigate to try editor page
    Given the user in Applications page
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
    Given the user in operations in Stack page
    When the user clicks on the Practice questions link
    Then the user navigates to the Practice page