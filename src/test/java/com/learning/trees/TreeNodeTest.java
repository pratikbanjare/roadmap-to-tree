package com.learning.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TreeNodeTest {

    /*
    Test: 1. Create a node with specified value
    Test 2 : Verify Lett node and right node are initially null
     */
    @Test
    public void test_constructor_with_single_argument(){
        TreeNode node = new TreeNode(5);
        Assertions.assertEquals(5,node.getValue());;

        Assertions.assertNull(node.getLeft());
        Assertions.assertNull(node.getRight());
    }

    @Test
    public void test_constructor_with_three_aruguments (){
        TreeNode left = new TreeNode();
        TreeNode right = new TreeNode();
        TreeNode node = new TreeNode(5, left, right);
        Assertions.assertEquals(left, node.getLeft());
        Assertions.assertEquals(right, node.getRight());
    }

    @Test
    public void test_setter_of_left_adn_right_child (){
        TreeNode node = new TreeNode();
        TreeNode right = new TreeNode();
        TreeNode left = new TreeNode();
        node.setLeft(left);
        node.setRight(right);

        Assertions.assertEquals(left, node.getLeft());
        Assertions.assertEquals(right, node.getRight());
    }


}
