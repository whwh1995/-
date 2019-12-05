package Study7;

public class Offer68 {
//	����������У������ڵ� p, q �Ĺ������� root ���� root.val >= p.val && root.val <= q.val��
//	���������
			public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
			    if (root == null)
			        return root;
			    if (root.val > p.val && root.val > q.val)
			        return lowestCommonAncestor(root.left, p, q);
			    if (root.val < p.val && root.val < q.val)
			        return lowestCommonAncestor(root.right, p, q);
			    return root;
			}
			
//	��ͨ������
//	�����������в����Ƿ���� p ���� q����� p �� q �ֱ������������У���ô��˵�����ڵ������͹������ȡ�

			public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
			    if (root == null || root == p || root == q)
			        return root;
			    TreeNode left = lowestCommonAncestor1(root.left, p, q);
			    TreeNode right = lowestCommonAncestor1(root.right, p, q);
			    return left == null ? right : right == null ? left : root;
			}
}
