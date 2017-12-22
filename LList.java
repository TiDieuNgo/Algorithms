package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LList {
	private Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	private void print() {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	private void push(int i) {
		Node newNode = new Node(i);
		newNode.next = head;
		head = newNode;
	}

	private static void printMerge(Node merge) {
		while (merge != null) {
			System.out.print(merge.data + " ");
			merge = merge.next;
		}
	}

	private static Node mergetwoList(Node node1, Node node2) {
		Node merge = null;
		if (node1 == null)
			return node2;
		if (node2 == null)
			return node1;

		if (node1.data < node2.data) {
			merge = node1;
			merge.next = mergetwoList(node1.next, node2);
		} else {
			merge = node2;
			merge.next = mergetwoList(node1, node2.next);
		}

		return merge;
	}

	// 1 -> 3 -> 4 -> 4 -> 5 -> 7
	private static Node removeElement(Node head, int data) {
		Node fake = new Node(-1);
		fake.next = head;
		Node pre = fake;
		Node cur = head;

		while (cur != null) {
			if (cur.data == data) {
				cur = cur.next;
				pre.next = cur;
			} else {
				pre = cur;
				cur = cur.next;
			}
		}

		return fake.next;
	}

	public static void main(String[] agrs) {
		Set<Node> set = new HashSet<>();

		LList list1 = new LList();
		list1.head = new Node(1);
		set.add(list1.head);
		list1.push(2);
		list1.push(3);
		//list1.print();
		// System.out.println();

		LList list2 = new LList();
		list2.head = new Node(7);
		list2.push(4);
		list2.push(1);
		// list2.print();
		// System.out.println();

		//Node merge = mergetwoList(list1.head, list2.head);

		// removeElement(merge, 4);
		//printMerge(removeElement(merge, 1));
		printReverse(list1.head);
	}

	private static void printReverse(Node head) {
		if (head == null)
			return;
		printReverse(head.next);
		System.out.print(head.data + "-");
	}

}
