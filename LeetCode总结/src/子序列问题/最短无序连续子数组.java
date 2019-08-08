package ����������;

public class ����������������� {
	/*����һ���������飬����ҪѰ��һ�������������飬���������������������������ô�������鶼���Ϊ��������

	���ҵ���������Ӧ����̵ģ���������ĳ��ȡ�

	ʾ�� 1:

	����: [2, 6, 4, 8, 10, 9, 15]
	���: 5
	����: ��ֻ��Ҫ�� [6, 4, 8, 10, 9] ��������������ô���������Ϊ��������*/
	class Solution {
	    public int findUnsortedSubarray(int[] nums) {
	       int length = nums.length;
	        int i=0; int j=length-1;
	        while(i<j){
	            if(nums[i+1] >= nums[i]){
	                i++;
	            }else{
	                break;
	            }

	        }
	        while(i<j){
	            if(nums[j-1] <= nums[j]){
	                j--;
	            }else{
	                break;
	            }

	        }
	        if(i==j) return 0;
	        int min = nums[i];
	        int max = nums[i];
	        for(int k=i+1; k<=j; k++){
	            min = Math.min(nums[k], min);
	            max = Math.max(nums[k], max);
	        }

	        while(--i>=0){
	            if(nums[i]<=min)
	                break;
	        }
	        while(++j<=length-1){
	            if(nums[j]>=max)
	                break;
	        }

	        return j-i-1;
	    }
	}
}
