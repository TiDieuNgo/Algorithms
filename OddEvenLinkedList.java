package LeetCode;

public class OddEvenLinkedList {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}
	}

	public static void main(String[] args) {
		ListNode list = new ListNode(1);
		list.next = new ListNode(2);
		list.next.next = new ListNode(3);
		list.next.next.next = new ListNode(4);
		list.next.next.next.next = new ListNode(5);
		list.next.next.next.next.next = new ListNode(6);
		list.next.next.next.next.next.next = new ListNode(7);
		list.next.next.next.next.next.next.next = new ListNode(8);
		//oddEvenList(list);
	}

	@SuppressWarnings("null")
	public static ListNode oddEvenList(ListNode head) {
		if (head == null && head.next == null)
			return head;

		ListNode odd = head;
		ListNode headOdd = odd;
		ListNode even = head.next;
		ListNode headEven = even;

		while (odd != null && odd.next != null && odd.next != null && even.next != null) {
			odd.next = odd.next.next;
			odd = odd.next;

			even.next = even.next.next;
			even = even.next;
		}

		odd.next = headEven;

		return headOdd;
	}
}
