package study3;

public class Offer27 {
//	�õ��������ľ���
	public void Mirror(TreeNode root) {
	    if (root == null)
	        return;
	    swap(root);
	    Mirror(root.left);
	    Mirror(root.right);
	}

	private void swap(TreeNode root) {
	    TreeNode t = root.left;
	    root.left = root.right;
	    root.right = t;
	}
}
