package LeetCode;

public class IsPalindrome {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(0);
		head.next.next = new ListNode(0);
		//head.next.next.next = new ListNode(1);

		System.out.println(isPalindrome(head));
	}

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        ListNode slow = new ListNode(-1); slow.next = head;
        ListNode fast = slow;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode pre = null;
        ListNode next = null;
        ListNode cur = head;
        while (cur != slow.next) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        if (fast == null) // odd nums
            cur = cur.next;

        while (cur != null) {
            if (cur.val != next.val)
                return false;

            cur = cur.next;
            next = next.next;
        }

        return true;
    }
}
