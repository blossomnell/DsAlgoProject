Feature: Graph functionality

  Background: 
    Given the user is logged in

  @tag
  Scenario: validating the Graph page
    Given the user is logged in
    When the user clicks the Get Started under Graph
    Then the user is navigated to Graph page

  @tag
  Scenario: validating the Graph page of Main Graph
    Given the user is in Graph page
    When the user clicks the Main Graph
    Then the user should be in the Main Graph page

  @tag
  Scenario: validating the python editor of Main Graph page
    Given the user is in the Main Graph page
    When the user clicks the Try here button of  Main Graph page
    Then the user should be in the python editor page of  Main Graph page

  @tag
  Scenario Outline: validating Run function  Main Graph page with invalid code and valid code
    Given the user is in the python editor of Main Graph page
    When The user enters python code of Main Graph page in Editor from Excel sheet "<sheetName>" and row <row> and clicks Run
    Then user will get the expectedOutcome from sheet "<sheetName>" and row <row>

    Examples: 
      | sheetName | row |
      | python PQ |   1 |
      | python PQ |   2 |

  @tag
  Scenario: validating the Graph Representations page
    Given the user is in the Graph page
    When the user clicks on the  Graph Representations
    Then the user should be in the Graph Representations page

  @tag
  Scenario: validating the python editor in Graph Representations page
    Given the user is in the Graph Representations page
    When the user clicks Try here button Graph Representations page
    Then the user should be in the python editor page of Graph Representations page

  @tag
  Scenario Outline: validating Run function with invalid code and valid code
    Given the user is in the python editor of Graph Representations page
    When the user enters python code in Editor from the Excel sheet "<sheetName>" and row <row> and clicks Run
    Then the user will get the expectedOutcome from sheet "<sheetName>" and row <row>

    Examples: 
      | sheetName | row |
      | python PQ |   1 |
      | python PQ |   2 |

  @tag
  Scenario: validating the Graph practice questions page
    Given user is in Graph page
    When the user clicks the Practice Questions of Graph page
    Then the user should see the Practice Questions page of Graph page
