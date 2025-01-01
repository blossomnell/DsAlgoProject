Feature: User Actions in the Python Editor and Related Pages

  Background: 
    Given the user is logged in

  @tag
  Scenario: Navigate to Time Complexity Page
    Given the user is in the homepage
    When the user clicks Get Started button under DataStructure
    Then the user is navigated to Data Structures-Introduction page

  @tag
  Scenario: Navigate to Time Complexity Page
    Given the user is in the Data Structures-Introduction page
    When the user clicks the Time Complexity link
    Then the user is navigated Time Complexity page

  @tag
  Scenario: Navigate to Python Editor Page
    Given the user is in the Time Complexity page
    When the user scrolls down and clicks the Try here button in Time Complexity Page
    Then the user is in the try editor page

  @tag
  Scenario Outline: Run code in the Python Editor
    Given the user is in the Python try editor page
    When the user enters data from sheet "<sheetName>" and row <row>
    Then the user sees "<expectedOutcome>"

    Examples: 
      | sheetName | row | expectedOutcome                                   |
      | python DS |   1 | popup error message containing SyntaxError        |
      | python DS |   2 | the user is able to see the output in the console |

  @tag
  Scenario: Navigate to Practice Questions Page
    Given the user is in the Time Complexity page
    When the user clicks the Practice Questions link
    Then the user is in the empty Practice Question page
