/**
 * leetcode 142 题，找到环形链表的入口结点
 * 先判定环，然后让 slow 指针指向头结点，然后
 * fast 指针和 slow 指针每次都走一步，他们相遇时，为环的入口结点。
 */
// 类的名字要大写
public class Solution {
	public ListNode detectCycle(ListNode head) {
		if(head == null || head.next == null ) return null;
		ListNode fast = head;
		ListNode slow = head;
		while(fast != null && fast.next != null) { 
			fast = fast.next.next;
			slow = slow.next;
			if(slow == fast){
				slow = head;
				while(slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}
				return slow;
			}
		}
		return null;
	}
}	
				
