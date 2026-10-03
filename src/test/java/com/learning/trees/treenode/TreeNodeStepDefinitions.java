package com.learning.trees.treenode;

import com.learning.trees.TreeNode;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class TreeNodeStepDefinitions {

    TreeNode treeNode;
    @Given("I create a tree node with value {int}")
    public void i_create_a_tree_node_with_value(Integer value) {
        treeNode = new TreeNode(value);
    }

    @Then("the node should store value {int}")
    public void the_node_should_store_value(Integer value) {
        Assertions.assertEquals(value, treeNode.getValue());
    }

    @Then("the node should have no left child")
    public void the_node_should_have_no_left_child() {
        Assertions.assertNull(treeNode.getLeft());
    }

    @Then("the node should have no right child")
    public void the_node_should_have_no_right_child() {
        Assertions.assertNull(treeNode.getRight());
    }

    @When("I attach a left child with value {int}")
    public void i_attach_a_left_child_with_value(Integer value) {
        TreeNode left = new TreeNode(value);
        treeNode.setLeft(left);
    }

    @When("I attach a right child with value {int}")
    public void i_attach_a_right_child_with_value(Integer value1) {
        TreeNode right = new TreeNode(value1);
        treeNode.setRight(right);
    }

    @Then("the left child should have value {int}")
    public void the_left_child_should_have_value(Integer value) {
        Assertions.assertEquals(value, treeNode.getLeft().getValue());
    }

    @Then("the right child should have value {int}")
    public void the_right_child_should_have_value(Integer value) {
        Assertions.assertEquals(value, treeNode.getRight().getValue());
    }


}
