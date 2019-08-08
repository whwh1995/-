package study;

import java.util.HashMap;
import java.util.Map;

public class offer5 {
	/*���ݶ�������ǰ���������������Ľ�����ؽ����ö����������������ǰ���������������Ľ���ж������ظ������֡�

	preorder = [1,2,4,7,3,5,6,8]
	inorder =  [4,7,2,1,5,3,8,6]
	*/
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
	   public TreeNode(int x) { 
			 val = x; 
	     }
	   public TreeNode(TreeNode left,TreeNode right,int val) {
		   this.left=left;
		   this.right=right;
		   this.val=val;
	   }
	   public TreeNode() {
		   
	   }
	}
	
	
	private Map<Integer, Integer> indexForInOrders = new HashMap<>();

	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
	    for (int i = 0; i < in.length; i++)
	        indexForInOrders.put(in[i], i);
	    return reConstructBinaryTree(pre, 0, pre.length - 1, 0);
	}

	private TreeNode reConstructBinaryTree(int[] pre, int preL, int preR, int inL) {
	    if (preL > preR)
	        return null;	
	    TreeNode root = new TreeNode(pre[preL]);
	    int inIndex = indexForInOrders.get(root.val);
	    int leftTreeSize = inIndex - inL;
	    root.left = reConstructBinaryTree(pre, preL + 1, preL + leftTreeSize, inL);
	    root.right = reConstructBinaryTree(pre, preL + leftTreeSize + 1, preR, inL + leftTreeSize + 1);
	    return root;
	}
	
	
}





/*public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return reConBTree(pre,0,pre.length-1,in,0,in.length-1);
    }
    public TreeNode reConBTree(int [] pre,int preleft,int preright,int [] in,int inleft,int inright){
        if(preleft > preright || inleft> inright)//������߽�����ʱ�򷵻�null
            return null;
        //�½�һ��TreeNode
        TreeNode root = new TreeNode(pre[preleft]);
        //�����������������߽�ı���
        for(int i = inleft; i<= inright; i++){
            if(pre[preleft] == in[i]){
                //�ع���������ע��߽�����
                root.left = reConBTree(pre,preleft+1,preleft+i-inleft,in,inleft,i-1);
                //�ع���������ע��߽�����
                root.right = reConBTree(pre,preleft+i+1-inleft,preright,in,i+1,inright);
            }
        }
        return root;     
    }*/