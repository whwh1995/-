package study4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Offer32Tree {
	/*�����д������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ�������������

	���磬���¶�������α����Ľ��Ϊ��1,2,3,4,5,6,7*/
//	ʹ�ö��������в�α�����
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
	    Queue<TreeNode> queue = new LinkedList<>();
	    ArrayList<Integer> ret = new ArrayList<>();
	    queue.add(root);
	    while (!queue.isEmpty()) {
	        int cnt = queue.size();
	        while (cnt-- > 0) {
	            TreeNode t = queue.poll();
	            if (t == null)
	                continue;
	            ret.add(t.val);
	            queue.add(t.left);
	            queue.add(t.right);
	        }
	    }
	    return ret;
	}
//	���д�ӡ
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
	    ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
	    Queue<TreeNode> queue = new LinkedList<>();
	    queue.add(pRoot);
	    while (!queue.isEmpty()) {
	        ArrayList<Integer> list = new ArrayList<>();
	        int cnt = queue.size();
	        while (cnt-- > 0) {
	            TreeNode node = queue.poll();
	            if (node == null)
	                continue;
	            list.add(node.val);
	            queue.add(node.left);
	            queue.add(node.right);
	        }
	        if (list.size() != 0)
	            ret.add(list);
	    }
	    return ret;
	}
	/*��֮����˳���ӡ��������
	��ʵ��һ����������֮���δ�ӡ��������
	����һ�а��մ����ҵ�˳���ӡ���ڶ��㰴�մ��������˳���ӡ�������а��մ����ҵ�˳���ӡ���������Դ����ơ�*/
//	�ⷨ1�����תҪ��ת�����е�Ԫ��	
	public ArrayList<ArrayList<Integer>> zPrint(TreeNode pRoot) {
		 ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
		    Queue<TreeNode> queue = new LinkedList<>();
		    queue.add(pRoot);
		    boolean reverse = false;
		    while (!queue.isEmpty()) {
		        ArrayList<Integer> list = new ArrayList<>();
		        int cnt = queue.size();
		        while (cnt-- > 0) {
		            TreeNode node = queue.poll();
		            if (node == null)
		                continue;
		            list.add(node.val);
		            queue.add(node.left);
		            queue.add(node.right);
		        }
		        if (reverse)
		            Collections.reverse(list);
		        reverse = !reverse;
		        if (list.size() != 0)
		            ret.add(list);
		    }
		    return ret;
	}
//	�ⷨ2��ʹ������ջ
	public ArrayList<ArrayList<Integer> > ZPrint(TreeNode Root) {
        int level = 1;
        //s1��������ڵ�
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        s1.push(Root);
        //s2��ż����ڵ�
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        while (!s1.empty() || !s2.empty()) {
            if (level%2 != 0) {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                while (!s1.empty()) {
                    TreeNode node = s1.pop();
                    if(node != null) {
                        temp.add(node.val);
                        s2.push(node.left);
                        s2.push(node.right);
                    }
                }
                if (!temp.isEmpty()) {
                    list.add(temp);
                    level++;
                    }
            } else {
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    while (!s2.empty()) {
                        TreeNode node = s2.pop();
                        if(node != null) {
                            temp.add(node.val);
                            s1.push(node.right);
                            s1.push(node.left);
                        }
                    }
                    if (!temp.isEmpty()) {
                        list.add(temp);
                        level++;
                    }
                }
            }
        return list;
    }
}

	
