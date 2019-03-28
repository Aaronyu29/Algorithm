class solution {
	public int midDepth(TreeNode root) {
		if(root == null) return 0;
		// 如果左子树为空，返回最小右子树深度 +1
		if(root.left == null) {
			return minDepth(root.right) +1;
		}
		if(root.right == null) {
			return minDepth(root.left) +1;
		}

		return Math.min(minDepth(root.left), minDepth(root.right)) +1;

	}
}

