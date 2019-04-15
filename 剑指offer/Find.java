/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public boolean Find(int target, int[][] array) {
	// 思路，从左下角开始遍历，如果小于目标值，向右移
	int len = array.length -1;
	int i = 0;
	while(len >= 0 && i < array[0].length) {
		if(array[len][i] < target) i++;
		else if(array[len][i] > target) len--;
		else return true;
	}
	return false;
}

