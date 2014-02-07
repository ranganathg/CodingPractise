package rangag.practise.leetcode;

import java.util.ArrayList;

public class BinaryTreePostorderTraversalRecursive {
	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.right = new TreeNode(2);
		node.left = null;
		node.right.left = new TreeNode(3);
		node.right.right = null;
		for (Integer i : postorderTraversal(node)) {
			System.out.println(i);
		}
	}

	public static ArrayList<Integer> postorderTraversal(TreeNode root) {
		// IMPORTANT: Please reset any member data you declared, as
		// the same Solution instance will be reused for each test case.
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		postorderTraversal(root, returnList);		
		return returnList;
	}

	private static void postorderTraversal(TreeNode root, ArrayList<Integer> list) {
		if (root == null) {
			return;
		}
		postorderTraversal(root.left, list);
		postorderTraversal(root.right, list);
		list.add(root.val);
	}
}