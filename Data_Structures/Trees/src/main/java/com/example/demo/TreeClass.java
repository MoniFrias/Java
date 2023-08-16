package com.example.demo;

public class TreeClass {

	Node root;
	int size;

	public TreeClass() {
		root = null;
		size = 0;
	}

	public void insert(int value) {
		if (root == null) {
			// is an empty tree
			root = new Node(value);
			size++;
		} else {
			Node temp = root;
			boolean flag = true;
			while (flag) {
				if (value < temp.value) {
					if (temp.left != null) { // if there is child
						temp = temp.left;
					} else {
						temp.left = new Node(value, temp);
						size++;
						flag = false;
					}
				} else {
					if (temp.right != null) {
						temp = temp.right;
					} else {
						temp.right = new Node(value, temp);
						size++;
						flag = false;
					}
				}
			}

		}
	}

	public String inorden() {
		return inorden(root);
	}

	private String inorden(Node n) {
		// left - root - right
		if (n != null) {
			return inorden(n.left) + n.value + " " + inorden(n.right);
		}
		return "";
	}

	public void preorden() {
		preorden(root);
	}

	private void preorden(Node n) {
		// root - left - right
		if (n != null) {
			System.out.print(n.value + " ");
			preorden(n.left);
			preorden(n.right);
		}
	}

	public void postorden() {
		postorden(root);
	}

	private void postorden(Node n) {
		// left - right - root
		if (n != null) {
			postorden(n.left);
			postorden(n.right);
			System.out.print(n.value + " ");
		}
	}

	public boolean search(int num) {
		Node temp = root;

		while (temp != null) {
			if (temp.value == num) {
				return true;
			}
			if (num < temp.value) {
				temp = temp.left;
			} else {
				temp = temp.right;
			}
		}
		return false; // no found

	}

	public Node searchNode(int num) {
		Node temp = root;

		while (temp != null) {
			if (temp.value == num) {
				return temp;
			}
			if (num < temp.value) {
				temp = temp.left;
			} else {
				temp = temp.right;
			}
		}
		return null; // no found

	}

	public boolean delete(int num) {
		Node temp = searchNode(num);
		if (temp != null) { // found
			// is leaf
			if (isLeaf(temp)) {
				deleteLeaf(temp);
			} else if (haveAChild(temp)) {
				deleteAChild(temp);
			} else {
				deleteTwoChild(temp);
			}
			size--;
			return true;
		}

		return false;

	}

	private boolean isLeaf(Node temp) {
		if (temp.left == null && temp.right == null) {
			return true;
		}
		return false;
	}

	private void deleteLeaf(Node temp) {
		if (temp.parent == null) { // is unique node (root without children)
			root = null;
		} else {
			if (temp == temp.parent.left) {
				temp.parent.left = null;
			} else {
				temp.parent.right = null;
			}
		}
	}

	private boolean haveAChild(Node temp) {
		if (temp.left == null && temp.right != null || temp.left != null && temp.right == null) { // have 1 child
			return true;
		}
		return false;
	}

	private void deleteAChild(Node temp) {
		if (temp == root) { // doesn't have parent is root
			if (temp.left != null) {// has left child
				root = temp.left;				
			} else { // has right child
				root = temp.right;
			}
			root.parent = null; //connection to new parent
		} else { // has parent
			if (temp.left != null) {// has left child
				if (temp == temp.parent.left) { // temp is his father's left child
					temp.parent.left = temp.left;
				} else {
					temp.parent.right = temp.left;
				}
				temp.left.parent = temp.parent;//connection to new parent
			} else {// has right child
				if (temp == temp.parent.left) {
					temp.parent.left = temp.right;
				} else {
					temp.parent.right = temp.right;
				}
				temp.right.parent = temp.parent;//connection to new parent
			}
		}
	}

	private void deleteTwoChild(Node temp) {
		Node big = searchBigger(temp.left);
		temp.value = big.value;
		if (isLeaf(big)) {
			deleteLeaf(big);
		} else {
			deleteAChild(big);
		}
	}

	private Node searchBigger(Node m) {
		while (m.right != null) {
			m = m.right;
		}
		return m;
	}

}
