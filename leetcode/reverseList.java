class solution{
	public ListNode reverseList(ListNode head) {
		ListNode cur = head;
		ListNode pre = null;
		ListNode nextTemp;
		// 预先把下一个节点的值存起来，只要判断好边界条件即可
		while(cur != null) {
			nextTemp = cur.next;

			cur.next = pre;
			pre = cur;
			cur = nextTemp;
		}
		return pre;
	}
}

