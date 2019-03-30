/**
 *n 个人围成一圈，开始数数，数到 m 的人出局，求最后一个人的编号
 *模拟循环链表实现
 */
import java.util.*;
public class Joseph {
	LinkedList<Integer> list = new LinkedList<Integer>();
	public int getResult(int n, int m) {
		if(n <= 0 || m <= 0) return -1;
		for(int i = 1; i<= n; i++) {
			list.add(i);
		}
		int count = 0;
		while(list.size() > 1) {
			int goal = ( count + m -1) % list.size();
			// goal 是要删除元素对应的下标，同时要更新 count
			list.remove(goal);
			count = goal % list.size();
		}
		return list.getFirst();
	}
}


