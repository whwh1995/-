package study;

public class Offer8erchashuxiagejiedian {
	/*����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�
	ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
	*/
	
	
	/*�� ���һ���ڵ����������Ϊ�գ���ô�ýڵ����һ���ڵ���������������ڵ㣻
	�� ���������ҵ�һ��������ָ����������ýڵ�����Ƚڵ�
	*/
	public class TreeNode {
	    int val;
	    TreeNode left = null;
	    TreeNode right = null;
	    TreeNode next = null;

	    TreeNode(int val) {
	        this.val = val;
	    }
	}
	public TreeNode findNode(TreeNode pNode){
		 if (pNode.right != null) {
		        TreeNode node = pNode.right;
		        while (node.left != null)
		            node = node.left;
		        return node;
		    } else {
		        while (pNode.next != null) {
		            TreeNode parent = pNode.next;
		            if (parent.left == pNode)
		                return parent;
		            pNode = pNode.next;
		        }
		    }
		    return null;
		}
			
			
			
			
	}
	
	
	
	
	
	
	
	

