class solution {
	Deque<Integer> window = new LinkedList<Integer>();
// window 窗口用双端队列实现
	public int[] maxSlidingWindow(int[] nums, int k) {	
		if(nums.length == null || k == 0) return new int[0];
		int count = 0;
		int[] res = new int[nums.length - k +1];
		for(int i = 0; i< nums.length; i++) {
			if(i >= k && window.peekFirst() <= i-k) {
				// 删除 window 第一个元素
				window.poolFirst();
			}
			while(!window.isEmpty() && nums[window[peekLast()]] <= nums[i] ) {
				// 删除 window 最后一个元素，window 队列里面放的是下标
				window.poolLast();
			}
			window.add(i);
			if(i >= k-1) {
				res[count++] = nums[window[peekFirst()]];
			}
		}
		return res;
	}

			
		
