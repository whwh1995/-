package ��ϣ;

import java.util.HashMap;


//  ��һ����չ��ͬ���뷨������ۼ��ܺͣ������� i �� j ����� k��
//  �� sum[i] - sum[j] = kλ������ i �� j ֮���Ԫ��֮���� k.
public class ��ΪK�������� {
	class Solution {
	    public int subarraySum(int[] nums, int k) {
	        HashMap<Integer,Integer> map=new HashMap<>();
	        int sum=0;
	        int count=0;
	        map.put(0,1);
	        for(int num:nums){
	            sum+=num;
	            int tmp=sum-k;
	            if(map.containsKey(tmp)){
	                count+=map.get(tmp);
	            }
	            map.put(sum,map.getOrDefault(sum,0)+1);
	        }
	        return count;
	    }
	}
}
