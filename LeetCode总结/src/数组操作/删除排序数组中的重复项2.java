package �������;

public class ɾ�����������е��ظ���2 {
//	����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�
//	ʹ��ÿ��Ԫ�����������Σ������Ƴ���������³��ȡ�
//	��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
	class Solution {
	    public int removeDuplicates(int[] nums) {
	        if(nums.length <= 2) 
	            return nums.length;
	        
	        int index = 1;
	        for(int i = 2; i < nums.length; i++){
	            if(nums[i] != nums[index-1])
	                nums[++index] = nums[i];
	        }
	        
	        return index+1;
	    }
	}
	
	//һ���ظ���
	class Solution1{
	    public int removeDuplicates(int[] nums) {
	        int index=1;
	        for(int i=1;i<nums.length;i++){
	            if(nums[i]!=nums[i-1])
	            {
	                nums[index]=nums[i];
	                index++;
	            }
	        }
	        return index;
	    }
	}
}
