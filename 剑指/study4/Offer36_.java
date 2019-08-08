package study4;

public class Offer36_ {
//	����һ�ö��������������ö���������ת����һ�������˫������Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
	private TreeNode pre = null;
	private TreeNode head = null;

	public TreeNode Convert(TreeNode root) {
	    inOrder(root);
	    return head;
	}

	private void inOrder(TreeNode node) {
	    if (node == null)
	        return;
	    inOrder(node.left);
	    node.left = pre;
	    if (pre != null)
	        pre.right = node;
	    pre = node;
	    if (head == null)
	        head = node;
	    inOrder(node.right);
	}
}
