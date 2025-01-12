Feature: Linked List functionality

 Background: 
    Given the user is logged in
 
  
  @tree
  Scenario: exploring the tree page
    Given The user is on the home page after logged in
    When The user selects Tree item from the drop down menu
    Then The user should be directed to the Tree Page

 @tree
  Scenario: The user is able to navigate to "Overview of Trees" page
    Given The user is on the Tree page after logged in
    When The user clicks on the Overview of Trees link
    Then The user should be directed to the "Overview of Trees"  Page 

  @tree
  Scenario: The user is able to navigate to a page having an tryEditor from Overview of Trees page
    Given The user is on the Overview of trees page after logged in 
    When The user clicks "Try Here" button in a "tree" page
    Then The user should be redirected to a page having tryEditor with a Run button to test

  @tree
  Scenario Outline: The user is presented with valid & invalid code in Editor for tree page
    Given The user is in a page having an Editor with a Run button to test
     When The user enters valid python code from sheet "<sheetName>" and <row> and clicks Run button
     Then the user expects the expected outcome from excel sheet "<sheetName>" and row <row>


   Examples: 
      | sheetName | row |            
      | python DS |   1 | 
      | python DS |   2 |
      
      
  
  @tree
  Scenario: The user is able to navigate to "Terminologies" Page
    Given The user is on the Tree page after logged in
    When The user clicks on the Terminologies button
    Then The user should be directed to the "Terminologies" of tree Page

  @tree
  Scenario: The user is able to navigate to Terminologies page having an tryEditor
    Given The user is on the terminologies page after logged in
    When The user clicks "Try Here" button in a "Terminologies" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @tree
  Scenario Outline: The user is presented with valid & invalid code in Editor for tree page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code from sheet "<sheetName>" and <row> and clicks Run button
   Then the user expects the expected outcome from excel sheet "<sheetName>" and row <row>


   Examples: 
      | sheetName | row |            
      | python DS |   1 | 
      | python DS |   2 |
         
  
  @tree
  Scenario: The user is able to navigate to "Types of Trees" Page
    Given The user is on the Tree page after logged in
    When The user clicks on the Types of Trees button
    Then The user should be directed to the "Types of Trees" of tree Page

  @tree
  Scenario: The user is able to navigate to a page having an tryEditor from Types of Trees page
    Given The user is on the types of trees after logged in
    When The user clicks "Try Here" button in a "types of tree" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

   @tree
  Scenario Outline: The user is presented with valid & invalid code in Editor for tree page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code from sheet "<sheetName>" and <row> and clicks Run button
   Then the user expects the expected outcome from excel sheet "<sheetName>" and row <row>


   Examples: 
      | sheetName | row |            
      | python DS |   1 | 
      | python DS |   2 |
      
      
  @tree
  Scenario: The user is able to navigate to "Tree Traversals" Page
    Given The user is on the Tree page after logged in
    When The user clicks on the Tree Traversals button
    Then The user should be directed to the "Tree Traversals" of tree Page

  @tree
  Scenario: The user is able to navigate to "Traversals illustration" Page
    Given The user is on the Tree page after logged in
    When The user clicks on the Traversal illustration button
    Then The user should be directed to the "Traversals-Illustration" of tree Page

  @tree
  Scenario: The user is able to navigate to "Binary trees" Page
    Given The user is on the Tree page after logged in
    When The user clicks on the binary trees button
    Then The user should be directed to the "Binary Trees" of tree Page

@tree
  Scenario: The user is able to navigate to "Types of Binary trees" Page
    Given The user is on the Tree page after logged in
    When The user clicks on the types of binary trees button
    Then The user should be directed to the "Types of Binary Trees" of tree Page

  @tree
  Scenario: The user is able to navigate to Implementation in Python Page
    Given The user is on the Tree page after logged in
    When The user clicks on the Implementation in Python button
    Then The user should be directed to the "Implementation in Python" of tree Page

  @tree
  Scenario: The user is able to navigate to binary tree traversals Page
    Given The user is on the Tree page after logged in
    When The user clicks on the binary tree traversals button
    Then The user should be directed to the "Binary Tree Traversals" of tree Page

  @tree
  Scenario: The user is able to navigate to Implementation of Binary Trees Page
    Given The user is on the Tree page after logged in
    When The user clicks on the Implementation of Binary Trees button
    Then The user should be directed to the "Implementation of Binary Trees" of tree Page

  @tree
  Scenario: The user is able to navigate to Applications of Binary Trees Page
    Given The user is on the Tree page after logged in
    When The user clicks on the Applications of Binary Trees button
    Then The user should be directed to the "Applications of Binary trees" of tree Page
    

  @tree
  Scenario: The user is able to navigate to a page having an tryEditor from Binary Search Trees Page
    Given The user is on the Binary Search Trees after logged in
    When The user clicks "Try Here" button in a "Binary Search Trees" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @tree
  Scenario: The user is able to navigate to "Implementation of BST" Page
    Given The user is on the Tree page after logged in
    When The user clicks on the Implementation of BST button
    Then The user should be directed to the "Implementation Of BST" of tree Page

  @tree
  Scenario: The user validating "Practice Questions" page
    Given The user is on the Tree page after logged in
    When The user clicks on the Overview of Trees link
    When The user clicks on the Practice Questions in Overview of Trees 
    Then The user should be directed to the Practice Questions of tree page
    