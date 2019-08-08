package study;
/*
 * ��һ������Ϊ n ����������������ֶ��� 0 �� n-1 �ķ�Χ�ڡ�
 * ������ĳЩ�������ظ��ģ�����֪���м����������ظ��ģ�Ҳ��֪��ÿ�������ظ����Ρ�
 * ���ҳ�����������һ���ظ������֡�
 * Input:
{2, 3, 1, 0, 2, 5}
Output:
2
 */
public class offer1 {
	public static void main(String[] args) {
		int[] a = {2,3,1,0,2,5};
		int x =duplicate(a);
		System.out.println(x);
	 
 }	 
	public static int duplicate(int[] nums ) {
		 int x;
		 if(nums==null) { 
			 return -1;
		 }
		 for(int i=0;i<nums.length;i++) {
			 while(nums[i]!=i) {
				 if(nums[i]==nums[nums[i]]) {
					 x=nums[i];
					 return x;
				 }
				swap(nums,i,nums[i]);
			 }
		 }
		 return -1;
	 }
	public static void swap(int[] nums, int i ,int j ) {
		int t=nums[i];
		nums[i]=nums[j];
		nums[j]=t;
	}
}

/*
	�ο��𰸣�
	
	public boolean duplicate(int[] nums, int length, int[] duplication) {
	    if (nums == null || length <= 0)
	        return false;
	    for (int i = 0; i < length; i++) {
	        while (nums[i] != i) {
	            if (nums[i] == nums[nums[i]]) {
	                duplication[0] = nums[i];
	                return true;
	            }
	            swap(nums, i, nums[i]);
	        }
	    }
	    return false;
	}

public  void swap(int[] nums, int i ,int j ) {
		int t=nums[i];
		nums[i]=nums[j];
		nums[j]=t;
		}
*/

