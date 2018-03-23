package com.metacube;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {
	BinaryTree tree; 
	
	@Before
	public void init() {
		tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
	}
	
	@Test
	public void testPrintPreorder() {
		Object[] actuals = tree.preorderTraversal();
		Object[] expecteds = new Object[] {1, 2, 4, 5, 3 };
		
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testPrintPostorder() {
		Object[] actuals = tree.postorderTraversal();
		Object[] expecteds = new Object[] {4, 5, 2, 3, 1};
		
		assertArrayEquals(expecteds, actuals);
	}
}
