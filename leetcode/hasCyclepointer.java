/**
 * 环形链表用快慢指针做
 */
public class solution {
	public boolean hasCyclepointer(ListNode head) {
		if(head == null || head.next == null) return false;		
		ListNode fast = head;
		ListNode slow = head;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if(slow == fast) return true;
		}
		return false;
	}
}
