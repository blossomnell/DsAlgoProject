Feature: Array page functionality

  Background: 
    Given the user is logged in

  @tag
  Scenario: validating the Array page
    Given the user is logged in
    When user clicks the Get Started button under Array
    Then user is navigated to array page

  @tag
  Scenario: validating the Arrays in Python page
    Given user is in the Array page
    When user clicks the Arrays in Python button
    Then user should be in the Arrays in Python page

  @tag
  Scenario: validating the python editor page
    Given user is in the Arrays in Python page
    When user  clicks the Try here button of Arrays in Python page
    Then user should be in the Python editor page

  @tag
  Scenario Outline: validating Run function  page with of Arrays in python page invalid code and valid code
    Given user is in the python editor of Arrays in python page
    When user will  enter data in python editor  of Arrays in python page from Excel sheet "<sheetName>" and <row> and clicks Run
    Then user will get the expectedOutcome  of Arrays in python page  from sheet "<sheetName>" and row <row>

    Examples: 
      | sheetName | row |
      | python PQ |   1 |
      | python PQ |   2 |

  @tag
  Scenario: validating the Arrays Using List page
    Given user is in Arrays in Python page
    When user clicks the Arrays Using List button
    Then user should be in the Arrays Using List page

  @tag
  Scenario: validating the python editor page of Arrays Using List
    Given user is in the Arrays Using List page
    When user clicks the Try here button of Arrays Using List page
    Then user should be in the Python editor page

  @tag
  Scenario Outline: validating Run function page of Arrays Using List page with invalid code and valid code
    Given user is in the python editor of Arrays Using List page
    When user will  enter data in python editor  of Arrays Using List page from Excel sheet "<sheetName>" and <row> and clicks Run
    Then user will get the expectedOutcome  of  Arrays Using List page  from sheet "<sheetName>" and row <row>

    Examples: 
      | sheetName | row |
      | python PQ |   1 |
      | python PQ |   2 |

  @tag
  Scenario: validating the Basic Operations in Lists page
    Given user is back in the Arrays Using List page
    When user clicks the Basic Operations in Lists button
    Then user should be in the Basic Operations in Lists page

  @tag
  Scenario: validating the python editor page of Basic Operations in Lists page
    Given user is in the Basic Operations in Lists page
    When user clicks the Try here button of Basic Operations in Lists page
    Then user should be in the Python editor of Basic Operations in Lists page

  @tag
  Scenario Outline: validating Run function page of Basic Operations in Lists page with invalid code and valid code
    Given user is in the python editor of Basic Operations in Lists page
    When user will  enter data in python editor Basic Operations in Lists page from Excel sheet "<sheetName>" and <row> and clicks Run
    Then user will get the expectedOutcome  of  Basic Operations in Lists page  from sheet "<sheetName>" and row <row>

    Examples: 
      | sheetName | row |
      | python PQ |   1 |
      | python PQ |   2 |

  @tag
  Scenario: validating the Applications of Array page
    Given user is back in the Basic Operations in Lists page
    When user clicks the Applications of Array button
    Then user should be in the Applications of Array page

  @tag
  Scenario: validating the python editor page
    Given user is in the Applications of Array page
    When user clicks the Try here button of Applications of Array page
    Then user should be in the Python editor page

  @tag
  Scenario Outline: validating Run function page of Applications of Array page with invalid code and valid code
    Given user is in the python editor of Applications of Array page
    When user will  enter data in python editor  of Applications of Array page from Excel sheet "<sheetName>" and <row> and clicks Run
    Then user will get the expectedOutcome  of  Applications of Array page  from sheet "<sheetName>" and row <row>

    Examples: 
      | sheetName | row |
      | python PQ |   1 |
      | python PQ |   2 |

  @tag
  Scenario: validating the Practice Questions Page
    Given user is back in the Applications of Array page
    When user clicks the Practice Questions button
    Then user should be in the Practice Questions page

  @tag
  Scenario: validating the Search the Array page
    Given user is in the Practice Questions page
    When user clicks on Search the Array button
    Then user is redirected to the python editor page

  @tag
  Scenario Outline: validating Run function of Search the Array with invalid and valid code
    Given user is in the python editor of Search the Array page
    When user will  enter data in python editor  of Search the Array page from Excel sheet "<sheetName>" and <row> and clicks Run
    Then user will get the expectedOutcome  of  Search the Array page  from sheet "<sheetName>" and row <row>

    Examples: 
      | sheetName | row |
      | python PQ |   1 |
      | python PQ |   3 |

  @tag
  Scenario: validating the Max Consecutive Ones page
    Given user is back in Practice Questions page
    When user clicks the Max Consecutive Ones button
    Then user should be in the Python editor of Max Consecutive Ones page

  @tag
  Scenario Outline: validating Run function of max Consecutive Ones with invalid and valid code
    Given user is in the Python editor page of max Consecutive Ones
    When user will  enter data in python editor of Max Consecutive Ones page from Excel sheet "<sheetName>" and <row> and clicks Run
    Then user will get the expectedOutcome  of  Max Consecutive Ones page  from sheet "<sheetName>" and row <row>

    Examples: 
      | sheetName | row |
      | python PQ |   1 |
      | python PQ |   4 |

  @tag
  Scenario: validating the Find Numbers with Even Number of Digits page
    Given user back in the Practice Questions page
    When user clicks on the Find Numbers with Even Number of Digits
    Then user is redirected to the python editor of Find Numbers with Even Number page

  @tag
  Scenario Outline: validating Run function of Find Numbers with Even Number of Digits with invalid and valid code
    Given user is in the Python editor page of Find Numbers with Even Number of Digits
    When user will  enter data in python editor Find Numbers With Even Number page from Excel sheet "<sheetName>" and <row> and clicks Run
    Then user will get the expectedOutcome  of  Find Numbers With Even Number page  from sheet "<sheetName>" and row <row>

    Examples: 
      | sheetName | row |
      | python PQ |   1 |
      | python PQ |   5 |

  @tag
  Scenario: validating the Squares of Sorted Array page
    Given user go back to the Practice Questions page
    When user clicks the Squares of a Sorted Array
    Then user is redirected to the python editor of Squares of a Sorted Array page

  @tag
  Scenario Outline: validating Run function of Squares of a Sorted Array with invalid and valid code
    Given user is in the Python editor page of Squares of a Sorted Array
    When user will  enter data in python editor Squares of a Sorted Array page from Excel sheet "<sheetName>" and <row> and clicks Run
    Then user will get the expectedOutcome  of  Squares of a Sorted Array page  from sheet "<sheetName>" and row <row>

    Examples: 
      | sheetName | row |
      | python PQ |   1 |
      | python PQ |   6 |
