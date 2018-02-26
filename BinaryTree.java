package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

class Node {
	int val;
	Node left, right;

	public Node(int item) {
		val = item;
		left = right = null;
	}
}

class BinaryTree {
	// Root of the Binary Tree
	Node root;

	public BinaryTree() {
		root = null;
	}

	/* function to print level order traversal of tree */
	void printLevelOrder() {
		int h = height(root);
		int i;
		for (i = 1; i <= h; i++)
			printGivenLevel(root, i);
	}

	/*
	 * Compute the "height" of a tree -- the number of nodes along the longest
	 * path from the root node down to the farthest leaf node.
	 */
	int height(Node root) {
		if (root == null)
			return 0;
		else {
			/* compute height of each subtree */
			int lheight = height(root.left);
			int rheight = height(root.right);

			/* use the larger one */
			if (lheight > rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}

	/* Print nodes at the given level */
	void printGivenLevel(Node root, int level) {
		if (root == null)
			return;
		if (level == 1) {
			System.out.println(root.val + " ");
		} else if (level > 1) {
			// System.out.println("level");
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);
		}
	}

	private void printGivenLevelUsingQueue(Node root) {
		Queue<Node> q = new java.util.LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node node = q.poll();
			System.out.println(node.val);
			if (node.left != null)
				q.add(node.left);
			if (node.right != null)
				q.add(node.right);
		}
	}

	private void printRoLeRi(Node root) {
		if (root == null)
			return;

		printRoLeRi(root.left);
		printRoLeRi(root.right);

		System.out.println(root.val);

	}

	private void printInOrderUsingStack(Node root) {
		Stack<Node> st = new Stack<Node>();

		Node n = st.push(root);

		System.out.println(n.val);
		/*
		 * addAllLeft(st,root); while (!st.isEmpty()) { Node node = st.pop();
		 * System.out.print(node.data + " "); if (node.right != null)
		 * addAllLeft(st, node.right); }
		 */
	}

	private void addAllLeft(Stack<Node> st, Node root) {
		st.add(root);
		if (root.left != null)
			addAllLeft(st, root.left);
	}

	private Node lowestCommonAncestor(Node root, Node p, Node q) {
		if (root == null)
			return null;

		Node max = p.val > q.val ? p : q;
		Node min = p.val > q.val ? q : q;

		while (root != null) {
			if (root.val == min.val || root.val == max.val || root.val >= min.val && root.val <= max.val)
				return root;
			if (root.val > min.val)
				root = root.left;
			else
				root = root.right;
		}

		return root;

	}

	/* Driver program to test above functions */
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(2);
		tree.root.left = new Node(2);
//		tree.root.left.left = new Node(4);
//		tree.root.left.right = new Node(3);
		tree.root.right = new Node(5);
		tree.root.right.right = new Node(7);
		tree.root.right.left = new Node(5);

		// System.out.println("Level order traversal of binary tree is ");
		// tree.printLevelOrder();
		// System.out.println(tree.height(tree.root));
		// tree.printRoLeRi(tree.root);

		// tree.printGivenLevelUsingQueue(tree.root);
		// tree.printInOrderUsingStack(tree.root);

		// tree.lowestCommonAncestor(tree.root, tree.root, tree.root.right);

		// System.out.println(tree.sumOfLeftLeaves(tree.root));
		//System.err.println(tree.isSymmertric(tree.root));
		//Map<Integer,Integer> map = new HashMap<>();
		//System.err.println(map.getOrDefault(2, 5));
		System.out.println(tree.findSeMin(tree.root));
	}

	private int findSeMin(Node root) {
		if (root == null)
            return -1;
        int min = Integer.MAX_VALUE;
        int se = Integer.MAX_VALUE;

        return helper(root, min, se);
    }

    int helper(Node root, int min, int se) {
        if (root.val < min) {
        	int temp = min;
            min = root.val;
            se = temp;
        }
        else if (root.val > min)
            se = Math.min(root.val, se);

        if (root.left != null)
            se = helper(root.left, min, se);

        if (root.right != null)
            se = helper(root.right, min, se);

        return se;
    }

	private boolean isSymmertric(Node root2) {
		if (root == null)
			return true;

		Queue<Node> q = new LinkedList<>();
		q.add(root.left);
		q.add(root.right);

		while (!q.isEmpty()) {
			Node left = q.poll();
			Node right = q.poll();

			if (left == null && right != null || left != null && right == null)
				return false;
			if (left.val != right.val)
				return false;
			if (left != null && right != null) {
				q.add(left.left);
				q.add(right.right);
				q.add(left.right);
				q.add(right.left);
			}

		}

		return true;

	}

	private int sumOfLeftLeaves(Node root) {

		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 0;

		int sum = 0;
		if (root.left != null && root.left.left == null && root.left.left == null)
			sum += root.left.val;

		if (root.right != null && root.right.left != null || root.right != null && root.right.right != null)
			sum += sumOfLeftLeaves(root.right);

		if (root.left != null && root.left.left != null || root.left != null && root.left.right != null)
			sum += sumOfLeftLeaves(root.left);

		return sum;

	}

}
