Feature: Binary tree node

  Scenario: Create a node with a value
    Given I create a tree node with value 10
    Then the node should store value 10

  Scenario: Create a node without children
    Given I create a tree node with value 10
    Then the node should have no left child
    And the node should have no right child

  Scenario: Attach child nodes
    Given I create a tree node with value 10
    When I attach a left child with value 5
    And I attach a right child with value 15
    Then the left child should have value 5
    And the right child should have value 15