/**
 *把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 
 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 
 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 * 该题目解法比较多，最好用二分查找解决，也可以判断哪一个数组元素小于后一个元素。
 */
import java.util.ArrayList;
public class solution {
	public int minNumberInRotateArray(int[] array) {
		if(array.length == 0) return 0;
		
		int[] a = array;
		int low = 0;
		int high = array.length -1;
		if(a[low] < a[high]) return a[low];
		while(low < high) {
			int mid = (high - low) /2 + low;
			// 如果数组是这种 {3,4, 5, 1, 2}
			if(a[mid] > a[high]) {
				low = mid +1;
				// 最小元素肯定在数组右边。
			}
			else if(a[mid] < a[high]) {
				high = mid;
				// 这里主要是考虑数组假如只有两个数时，比如 {4, 6} high = mid -1;
				// 不满足要求
			}
			else {
				high --;
				// 如果中间值等于末尾值，我们只能慢慢缩小距离
				// 举例：{1,1,1,0,1} 和 {1, 0, 1, 1, 1} 我们无法确定最小值在左边还是右边
			}
		}
		return a[low];
	}
}
