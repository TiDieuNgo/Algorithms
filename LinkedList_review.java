package LeetCode;

import LeetCode.LinkedList_review.Node;

public class LinkedList_review {

	static Node head;

	private Node head2;

	static class Node {
		private int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	static void printLinkedList(LinkedList_review list) {
		while (list.head2 != null) {
			System.out.print(list.head2.data + " ");
			list.head2 = list.head2.next;
		}
	}

	private static void insertFirst(LinkedList_review list, int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	private static void insertLast(LinkedList_review list, int data) {
		Node newNode = new Node(data);
		Node temp = head;
		while (temp != null) {
			if (temp.next == null) {
				temp.next = newNode;
				break;
			} else
				temp = temp.next;

		}
	}

	private static void printMid(LinkedList_review list) {

		if (head != null) {
			Node slow = head;
			Node fast = head;

			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}

			System.err.println(slow.data);
		}
	}

	private static void deleteDup(LinkedList_review list) {
		Node cur = head;
		while (cur.next != null) {
			if (cur.data == cur.next.data) {
				Node temp = cur.next.next;
				cur.next = temp;
			}
			else
			cur = cur.next;
		}

	}

	public static void main(String[] args) {
		LinkedList_review list = new LinkedList_review();
		head = new Node(2);
		head.next = new Node(5);

		insertFirst(list, 1);
		insertLast(list, 9);
		insertLast(list, 9);
		insertLast(list, 9);

		// printMid(list);
		//deleteDup(list);
		//printLinkedList(list);


		LinkedList_review list2 = new LinkedList_review();
		list2.head2 = new Node(67);
		list2.head2.next = list.head.next;
		printLinkedList(list2);
	}

}
