package rangag.practise.leetcode;
public class MinHeight {
	public static void main(String[] args) {
		TreeNode node = new TreeNode();
		TreeNode node2 = new TreeNode();
		TreeNode node3 = new TreeNode();
		TreeNode node4 = new TreeNode();
		node.val = 1;
		node.left = node2;
		node.right = node3;
		node2.left = node2.right = null;
		node3.left = node4;
		node3.right = null;
		node4.left = node4.right = null;
		int x = minDepth(node);
		System.out.println(x);
	}

	 public static int minDepth(TreeNode root) {
	        if(root==null) return 0;
	        if (root.left == null && root.right == null) {
				return 1;
			}
			int l = Integer.MAX_VALUE, r = Integer.MAX_VALUE;
			if (root.left != null) {
				l = minDepth(root.left);
			}
			if (root.right != null) {
				r = minDepth(root.right);
			}
			if (r < l)
				return r + 1;
			else
				return l + 1;
	    }
}
