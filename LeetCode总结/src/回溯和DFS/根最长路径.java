package ���ݺ�DFS;

import java.util.ArrayList;

public class ���·�� {
	/*����һ�Ŷ������ĸ��ڵ��һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
	·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
	(ע��: �ڷ���ֵ��list�У����鳤�ȴ�����鿿ǰ)
*/
         ArrayList<ArrayList<Integer>> list =new ArrayList<>();
        public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
            backtracking(root,target,new ArrayList<>());
                return list;
        }
        public void backtracking(TreeNode root ,int target ,ArrayList<Integer> tmp){
            if(root==null)
                return;
            target-=root.val;
            tmp.add(root.val);
            if(target==0&&root.left==null&&root.right==null){
                list.add(new ArrayList<>(tmp));
            }else{
                backtracking(root.left,target,tmp);
                backtracking(root.right,target,tmp);
            }
            tmp.remove(tmp.size()-1);
        }
    }


