Feature: user actions on stack pages

  Background:
    Given the user is logged in

  Scenario: Navigate to Stack page
    Given the user is in the homepage
    When the user clicks on the Get started button under stack
    Then the user navigates to the Stack page

  Scenario: Navigate to Operations in Stack page
    Given the user in th stack page
    When the user clicks on the Operations in Stack link
    Then the user navigates to the Operations in Stack page

  Scenario: Navigate to try editor page
    Given the user in operations in Stack page
    When the user scroll down and clicks try here button
    Then the user navigates to try editor page

  Scenario Outline: Run code in the Python Editor
    Given the user is in the try editor page in stack
    When the user enters '<code>' in the editor and clicks Run button
    Then the user sees "<expectedOutcome>"

    Examples:
      | code                  | expectedOutcome                                   |
      | print(\\"Hello\\")abc | popup error message containing SyntaxError        |
      | print(\\"Hello\\")    | the user is able to see the output in the console |

  Scenario: navigates to Implementation page
    Given the user in th stack page
    When the user clicks on the Implementation link
    Then the user navigates to the Implementation page

  Scenario: Navigate to try editor page
    Given the user in Implementation page
    When the user scroll down and clicks try here button
    Then the user navigates to try editor page

  Scenario Outline: Run code in the Python Editor
    Given the user is in the try editor page in Implementation
    When the user enters "<code>" in the editor and clicks Run button
    Then the user sees "<expectedOutcome>"

    Examples:
      | code                  | expectedOutcome                                   |
      | print(\\"Hello\\")abc | popup error message containing SyntaxError        |
      | print(\\"Hello\\")    | the user is able to see the output in the console |

  Scenario: navigates to Applications page
    Given the user in th stack page
    When the user clicks on the Applications link
    Then the user navigates to the Applications page

  Scenario: Navigate to try editor page
    Given the user in Applications page
    When the user scroll down and clicks try here button
    Then the user navigates to try editor page

  Scenario Outline: Run code in the Python Editor
    Given the user is in the try editor page in Application
    When the user enters '<code>' in the editor and clicks Run button
    Then the user sees "<expectedOutcome>"

    Examples:
      | code                 | expectedOutcome                                   |
      | print(\\"abcd123\\")abc | popup error message containing SyntaxError        |
      | print(\\"Hi\\")      | the user is able to see the output in the console |

  Scenario: Navigate to Practice questions page
    Given the user in operations in Stack page
    When the user clicks on the Practice questions link
    Then the user navigates to the Practice page
