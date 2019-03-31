/**leetcode 141 题，判断是否有环形链表
 * 本题用 哈希表来存储每个节点的引用。
 */
public class solution {
	Set<ListNode> list = new HashSet<>();
	public boolean hasCycle(ListNode head){
		while(head != null) {
			if(list.contains(head) ) return true;
			else {
				list.add(head);
			}
			head = head.next;
		}
		return false;
	}
}
