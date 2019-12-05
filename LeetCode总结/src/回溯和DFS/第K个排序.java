package ���ݺ�DFS;

import java.util.ArrayList;
import java.util.List;

public class ��K������ {
//	�������� [1,2,3,��,n]��������Ԫ�ع��� n! �����С�
	class Solution {
	    public String getPermutation(int n, int k) {
	         StringBuilder sb = new StringBuilder();
	        // ��ѡ����
	        List<Integer> candidates = new ArrayList<>();
	        // ��ĸ�Ľ׳���
	        int[] factorials = new int[n+1];
	        factorials[0] = 1;
	        int fact = 1;
	        for(int i = 1; i <= n; ++i) {
	            candidates.add(i);
	            fact *= i;
	            factorials[i] = fact;
	        }
	        k -= 1;
	        for(int i = n-1; i >= 0; --i) {
	            // �����ѡ���ֵ�index
	            int index = k / factorials[i];
	            sb.append(candidates.remove(index));
	            k -= index*factorials[i];
	        }
	        return sb.toString();
	    }
	}
}
