package com.metacube;

import static org.junit.Assert.*;

import org.junit.Test;

public class MirrorTreesTest {

	@Test
	public void testIsMirrorSuccess() {
		BinaryTree tree1 = new BinaryTree();
		tree1.root = new Node(2);
		tree1.root.left = new Node(1);
		tree1.root.right = new Node(5);
		tree1.root.left.left = new Node(0);
		
		BinaryTree tree2 = new BinaryTree();
		tree2.root = new Node(5);
		tree2.root.left = new Node(4);
		tree2.root.right = new Node(8);
		tree2.root.right.right = new Node(10);
		
		Boolean actual = MirrorTrees.isMirror(tree1.root, tree2.root);
		Boolean expected = true;
		
		assertEquals(expected, actual);
	}

	@Test
	public void testIsMirrorFailure() {
		BinaryTree tree1 = new BinaryTree();
		tree1.root = new Node(2);
		tree1.root.left = new Node(1);
		tree1.root.right = new Node(5);
		tree1.root.left.left = new Node(0);
		
		BinaryTree tree2 = new BinaryTree();
		tree2.root = new Node(5);
		tree2.root.left = new Node(4);
		tree2.root.right = new Node(8);
		
		Boolean actual = MirrorTrees.isMirror(tree1.root, tree2.root);
		Boolean expected = false;
		
		assertEquals(expected, actual);
	}
}
