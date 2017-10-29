package LeetCode;

public class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void printNode() {
		Node current = head;
		while (current != null) {
			System.out.print(" " + current.data);
			current = current.next;
		}

		System.out.print("\n");
	}

	public void delete(int data) {
		Node temp = head;
		Node prev = null;


		// if head == data
		if (temp != null && temp.data == data) {
			head = temp.next;
			return;

		}

		// keep track to find the key
		while (temp != null && temp.data != data ) {
			prev = temp;
			temp = temp.next;
		}

		if (temp == null)
			return;


		prev.next = temp.next;
	}

	public static void main(String[] argc) {
		LinkedList list = new LinkedList();
		list.push(2);
		list.push(3);
		list.push(5);
		list.printNode();

		list.delete(2);
		list.printNode();
	}

}
