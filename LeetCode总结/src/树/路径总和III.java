package ��;

public class ·���ܺ�III {
	/*����һ��������������ÿ����㶼�����һ������ֵ��

	�ҳ�·���͵��ڸ�����ֵ��·��������

	·������Ҫ�Ӹ��ڵ㿪ʼ��Ҳ����Ҫ��Ҷ�ӽڵ����������·��������������µģ�ֻ�ܴӸ��ڵ㵽�ӽڵ㣩��

	������������1000���ڵ㣬�ҽڵ���ֵ��Χ�� [-1000000,1000000] ��������
*/
	class Solution {
	    int count=0;
	    public int pathSum(TreeNode root, int sum) {
	        if(root==null)
	            return 0;
	        backtracking(root,sum);
	        pathSum(root.left,sum);
	        pathSum(root.right,sum);
	        return count;
	    }
	    public void backtracking(TreeNode root,int sum){
	        if(root==null){
	            return;
	        }
	        sum-=root.val;
	         if(sum==0){
	            count++;
	        }
	        backtracking(root.left,sum);
	        backtracking(root.right,sum);
	    }
	}
}
