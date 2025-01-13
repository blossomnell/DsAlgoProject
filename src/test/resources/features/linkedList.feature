Feature: Linked List functionality

  Background: 
    Given the user is logged in

  @tag
  Scenario: exploring the LinkedList page
    Given the user is logged in
    When the user clicks the Get Started under Linked List
    Then the user is navigated to Linked List page

  @tag
  Scenario: exploring the Introduction page
    Given the user is in Linked List page
    When the user clicks the Introduction
    Then the user should be in the Introduction page

  @tag
  Scenario: exploring the python editor of Introduction page
    Given the user is in the Introduction page
    When the user clicks the Try here button
    Then the user should be in the python editor page

  @tag
  Scenario Outline: validating Run function with invalid code and valid code
    Given the user is in the python editor of Introduction page
    When the user enters data from sheet "<sheetName>" and row <row>
    Then the user gets the expectedOutcome from sheet "<sheetName>" and row <row>

    Examples: 
      | sheetName  | row |
      | LinkedList |   1 |
      | LinkedList |   2 |

  @tag
  Scenario: exploring the Creating Linked List page
    Given the user is in the Linked List page
    When the user clicks on the Creating Linked List
    Then the user should be in the Creating Linked List page

  @tag
  Scenario: exploring the python editor in Creating Linked List page
    Given the user is in the Creating Linked List page
    When the user clicks Try here button
    Then the user should be in the python editor page

  @tag
  Scenario Outline: validating Run function with invalid code and valid code
    Given the user is in the python editor of Creating Linked List page
    When the user enters data from sheet "<sheetName>" and row <row>
    Then the user gets the expectedOutcome from sheet "<sheetName>" and row <row>

    Examples: 
      | sheetName  | row |
      | LinkedList |   1 |
      | LinkedList |   2 |

  @tag
  Scenario: exploring the Types of Linked List page
    Given the user is in the Linked List page
    When the user clicks on Types of Linked List
    Then the user should be in the Types of Linked List page

  @tag
  Scenario: exploring the python editor of Types of Linked List page
    Given the user is in the Types of Linked List page
    When the user clicks the Try here button
    Then the user should be in the python editor page

  @tag
  Scenario Outline: validating Run function with invalid code and valid code
    Given the user is in the python editor of Types of Linked List page
    When the user enters data from sheet "<sheetName>" and row <row>
    Then the user gets the expectedOutcome from sheet "<sheetName>" and row <row>

    Examples: 
      | sheetName  | row |
      | LinkedList |   1 |
      | LinkedList |   2 |

  @tag
  Scenario: exploring the Implement Linked List in Python page
    Given the user is in the Linked List page
    When the user clicks the Implement Linked List in Python
    Then the user should be in the Implement Linked List in Python page

  @tag
  Scenario: exploring the python editor page in Implement Linked List in Python page
    Given the user is in the Implement Linked List in Python page
    When the user clicks the Try here button
    Then the user should be in the python editor page

  @tag
  Scenario Outline: validating Run function with invalid code and valid code
    Given the user is in the python editor of the Implement Linked List in Python page
    When the user enters data from sheet "<sheetName>" and row <row>
    Then the user gets the expectedOutcome from sheet "<sheetName>" and row <row>

    Examples: 
      | sheetName  | row |
      | LinkedList |   1 |
      | LinkedList |   2 |

  @tag
  Scenario: exploring the Traversal page
    Given the user is in the Linked List page
    When the user clicks the Traversal
    Then the user should be in the Traversal page

  @tag
  Scenario: exploring the python editor page of Traversal page
    Given the user is in the Traversal page
    When the user clicks the Try here button
    Then the user should be in the python editor page

  @tag
  Scenario Outline: validating Run function with invalid code and valid code
    Given the user is in the python editor of the Traversal page
    When the user enters data from sheet "<sheetName>" and row <row>
    Then the user gets the expectedOutcome from sheet "<sheetName>" and row <row>

    Examples: 
      | sheetName  | row |
      | LinkedList |   1 |
      | LinkedList |   2 |

  @tag
  Scenario: exploring the Insertion page
    Given the user is in the Linked List page
    When the user clicks the Insertion
    Then the user should be in the Insertion page

  @tag
  Scenario: exploring the python editor page of Insertion page
    Given the user is in the Insertion page
    When the user clicks Try here button
    Then the user should be in the python editor page

  @tag
  Scenario Outline: validating Run function with invalid code and valid code
    Given the user is in the python editor of the Insertion page
    When the user enters data from sheet "<sheetName>" and row <row>
    Then the user gets the expectedOutcome from sheet "<sheetName>" and row <row>

    Examples: 
      | sheetName  | row |
      | LinkedList |   1 |
      | LinkedList |   2 |

  @tag
  Scenario: exploring the Deletion page
    Given the user is in the Linked List page
    When the user clicks the Deletion
    Then the user should be in the Deletion page

  @tag
  Scenario: exploring the python editor page of Deletion page
    Given the user is in the Deletion page
    When the user clicks Try here button
    Then the user should be in the python editor page

  @tag
  Scenario Outline: validating Run function with invalid code and valid code
    Given the user is in the python editor of the Deletion page
    When the user enters data from sheet "<sheetName>" and row <row>
    Then the user gets the expectedOutcome from sheet "<sheetName>" and row <row>

    Examples: 
      | sheetName  | row |
      | LinkedList |   1 |
      | LinkedList |   2 |

  @tag
  Scenario: Exploring the practice questions page
    Given the user is in the Introduction page
    When the user clicks the Practice Questions
    Then the user should see the Practice Questions page
