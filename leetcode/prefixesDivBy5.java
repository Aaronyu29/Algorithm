/**
 * leetcode 1029 题，可被 5 整除的二进制前缀。
 * 注意边界条件以及取余操作
 */
class Solution {
	List<Boolean> list = new ArrayList<>();
	public List<Boolean> prefixesDivBy5(int[] A) {
		int sum = 0;

		for(int element: A) {
			sum = ((sum << 1) + element ) % 5;
			list.add(sum == 0);
		}
		return list;
	}
}

