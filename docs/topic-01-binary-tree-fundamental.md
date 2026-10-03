# Binary Tree Fundamentals

## 1. Introduction to Trees

A **tree** is a non-linear, hierarchical data structure consisting of nodes connected by edges.

Unlike linear data structures such as arrays, linked lists, stacks, and queues, trees represent hierarchical relationships between elements.

Trees are commonly used in:

* File systems
* Database indexing
* Searching and sorting
* Compilers and expression evaluation
* Hierarchical data representation
* Network routing and decision-making

### 1.1 Basic Tree Structure

A tree consists of:

* **Nodes:** Elements that store data.
* **Edges:** Connections between nodes.
* **Root:** The topmost node of the tree.
* **Parent:** A node that has one or more child nodes.
* **Child:** A node connected below another node.
* **Leaf:** A node that has no children.

## 2. Binary Trees

A **binary tree** is a tree in which each node can have at most two children.

These children are conventionally referred to as:

* **Left child**
* **Right child**

A node can have:

* No children
* Only a left child
* Only a right child
* Both left and right children

A binary tree does not necessarily need to be balanced, complete, or sorted.

### 2.1 Example

Consider the following binary tree:

```text
             10
           /    \
          5      15
         / \    /  \
        3   7  12  20
```

In this example:

* `10` is the root.
* `5` and `15` are children of `10`.
* `3` and `7` are children of `5`.
* `12` and `20` are children of `15`.
* `3`, `7`, `12`, and `20` are leaf nodes.

## 3. Tree Terminology

### 3.1 Root

The root is the topmost node of a tree. It has no parent.

In the example, `10` is the root.

### 3.2 Parent and Child

A node directly connected above another node is its parent. The node below it is its child.

For example:

* `10` is the parent of `5` and `15`.
* `5` is the parent of `3` and `7`.

### 3.3 Leaf Node

A leaf node is a node with no children.

In the example, `3`, `7`, `12`, and `20` are leaf nodes.

### 3.4 Internal Node

An internal node is a node that has at least one child.

In the example, `10`, `5`, and `15` are internal nodes.

### 3.5 Subtree

A subtree is a node together with all its descendants.

For example, the subtree rooted at `5` is:

```text
       5
      / \
     3   7
```

Every node in a tree can be considered the root of its own subtree.

### 3.6 Ancestor and Descendant

An ancestor of a node is any node on the path from the root to that node, excluding the node itself.

A descendant is any node that occurs below a given node.

For example, `10` and `5` are ancestors of `3`, while `3` is a descendant of `5` and `10`.

### 3.7 Sibling

Nodes that share the same parent are siblings.

For example, `5` and `15` are siblings, as are `3` and `7`.

## 4. Depth and Height

Depth and height are related concepts but measure different things.

### 4.1 Depth

The **depth** of a node is the number of edges from the root to that node.

The root has a depth of `0`.

For the example tree:

| Node | Depth |
| ---- | ----: |
| 10   |     0 |
| 5    |     1 |
| 15   |     1 |
| 3    |     2 |
| 7    |     2 |
| 12   |     2 |
| 20   |     2 |

### 4.2 Height

The **height** of a node is the number of edges along the longest downward path from that node to a leaf.

For this learning plan, height is measured in edges:

* A leaf node has height `0`.
* An empty tree has height `-1`.
* The height of a tree is the height of its root.

For the example tree:

| Node | Height |
| ---- | -----: |
| 10   |      2 |
| 5    |      1 |
| 15   |      1 |
| 3    |      0 |
| 7    |      0 |
| 12   |      0 |
| 20   |      0 |

The height of the example tree is `2`.

**Note:** Some textbooks define height using the number of nodes instead of edges. Always identify which convention is being used.

## 5. Properties of Binary Trees

### 5.1 Maximum Number of Nodes

For a binary tree with a root at level `0`, the maximum number of nodes at level `L` is:

$$
2^L
$$

The maximum number of nodes in a binary tree of height `h` is:

$$
2^{h+1}-1
$$

This maximum occurs when every level is completely filled.

### 5.2 Minimum Height

For a binary tree containing `n` nodes, the minimum possible height occurs when the tree is as full and balanced as possible.

Using edge-based height:

$$
h_{\min} = \lceil \log_2(n+1) \rceil - 1
$$

This assumes `n > 0`.

### 5.3 Number of Edges

A non-empty tree containing `n` nodes has exactly:

$$
n-1
$$

edges.

This is because every node except the root has exactly one parent.

## 6. Types of Binary Trees

### 6.1 Full Binary Tree

A full binary tree is one in which every node has either zero or two children.

A node with exactly one child is not allowed.

### 6.2 Complete Binary Tree

A complete binary tree has every level completely filled except possibly the last level. Nodes on the last level are filled from left to right.

### 6.3 Perfect Binary Tree

A perfect binary tree has all internal nodes with exactly two children, and all leaf nodes are at the same level.

### 6.4 Balanced Binary Tree

A balanced binary tree maintains its height within a bound that keeps important operations efficient.

Different types of balanced trees have different formal balancing rules.

### 6.5 Skewed Binary Tree

A skewed binary tree is one where each internal node has only one child.

A skewed tree can resemble a linked list and may have height `n - 1` for `n` nodes.

## 7. Representing a Binary Tree in Java

A common way to represent a binary tree is through linked nodes.

Each node stores:

* A value
* A reference to its left child
* A reference to its right child

Conceptually, a node can be represented as:

```text
TreeNode
 ├── value
 ├── left
 └── right
```

Each child reference points to another `TreeNode` or is `null` if the child does not exist.

### 7.1 Encapsulation

Encapsulation means keeping an object's internal state protected and exposing controlled access through methods.

Using `private` fields prevents other classes from directly accessing those fields.

Getter and setter methods provide access to read or update state.

### 7.2 Constructors

Constructors initialize an object when it is created.

A node may support:

* A constructor that accepts only a value.
* A constructor that accepts a value and both child references.
* Optionally, a no-argument constructor.

Constructor chaining allows one constructor to delegate initialization to another, reducing duplicated initialization logic.

A no-argument constructor can be convenient for flexible object construction, but primitive fields such as `int` receive Java's default value of `0`. This may be undesirable if `0` is also a valid data value.

### 7.3 Mutable and Immutable Nodes

A mutable node allows its value or child references to change after construction.

Advantages:

* Flexible tree construction
* Convenient for attaching or replacing children
* Useful for general-purpose binary tree exercises

Potential risks:

* External modifications can unintentionally change tree structure.
* Changing values in a Binary Search Tree can violate its ordering property.

An immutable or partially immutable design restricts which fields can be changed after construction.

The appropriate design depends on the type of tree and how its operations are implemented.

## 8. Testing TreeNode

Testing verifies that the node behaves as intended and helps prevent regressions as the tree implementation grows.

### 8.1 Unit Testing with JUnit 5

JUnit 5 is a Java testing framework used to verify small units of functionality independently.

For a `TreeNode`, useful test cases include:

* Creating a node with a value.
* Verifying the stored value.
* Verifying that child references are initially `null`.
* Creating a node with preassigned children.
* Attaching left and right children using setters.
* Verifying that the references point to the expected objects.

Common assertions include:

| Assertion                        | Purpose                                             |
| -------------------------------- | --------------------------------------------------- |
| `assertEquals(expected, actual)` | Checks value equality                               |
| `assertNull(actual)`             | Checks that a reference is `null`                   |
| `assertNotNull(actual)`          | Checks that a reference is not `null`               |
| `assertSame(expected, actual)`   | Checks that two references point to the same object |

For child references, `assertSame()` can make it explicit that the exact child object was attached.

### 8.2 Behavior-Driven Development with Cucumber

Cucumber supports Behavior-Driven Development (BDD), allowing system behavior to be expressed in a readable format using Gherkin.

A feature file describes behavior in terms of:

* **Given:** The initial context or state.
* **When:** An action is performed.
* **Then:** The expected outcome.

Example:

```gherkin
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
```

Cucumber step definitions connect these Gherkin steps to executable Java code.

### 8.3 JUnit vs. Cucumber

| JUnit 5                                      | Cucumber                                       |
| -------------------------------------------- | ---------------------------------------------- |
| Focuses on unit-level correctness            | Focuses on behavior and features               |
| Typically written in Java                    | Scenarios written in Gherkin                   |
| Useful for edge cases and precise assertions | Useful for readable requirements and workflows |
| Usually tests methods and classes directly   | Tests behavior through defined steps           |

Both can be used together. JUnit tests should provide detailed coverage of the node's logic, while Cucumber scenarios should describe important user- or feature-level behaviors without duplicating every unit test.

## 9. Key Takeaways

* A binary tree is a hierarchical structure in which each node has at most two children.
* The root is the entry point of a tree.
* Leaf nodes have no children.
* A subtree is a node and all of its descendants.
* Depth measures distance from the root, while height measures the longest downward path to a leaf.
* The height convention used here counts edges, so a leaf has height `0` and an empty tree has height `-1`.
* Linked-node representation uses references to connect nodes.
* Encapsulation protects internal state, while mutability offers flexibility but can introduce risks.
* JUnit 5 is useful for focused unit tests.
* Cucumber expresses behavior in readable Given-When-Then scenarios.

## 10. Practice Questions

1. What is the difference between a binary tree and a Binary Search Tree?
2. Can a binary tree have only a left child and no right child?
3. What is the depth of the root?
4. What is the height of a tree containing only one node?
5. How many edges exist in a non-empty tree containing `15` nodes?
6. What is the maximum number of nodes in a binary tree of height `3`?
7. What makes a complete binary tree different from a perfect binary tree?
8. Why can changing a node's value be dangerous in a Binary Search Tree?
9. When would you use `assertSame()` rather than `assertEquals()`?
10. What is the difference between a JUnit unit test and a Cucumber scenario?
