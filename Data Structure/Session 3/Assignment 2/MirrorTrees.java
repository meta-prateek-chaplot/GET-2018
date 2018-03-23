package com.metacube;

class Node {
	Object data;
	Node left, right;
	
	Node(Object item) {
		data = item;
		left = right = null;
	}
}

class BinaryTree {
	Node root;
	
	BinaryTree() {
		root = null;
	}
}

public class MirrorTrees {
	static Boolean isMirror(Node nodeFirst, Node nodeSecond) {
		if( (nodeFirst != null) && (nodeSecond != null) ) {
			if( isMirror(nodeFirst.left, nodeSecond.right) ) {
				return isMirror(nodeFirst.right, nodeSecond.left);
			} else {
				return false;
			}
		} else if( (nodeFirst == null) && (nodeSecond == null) ) {
			return true;
		}

		return false;
	}
}
