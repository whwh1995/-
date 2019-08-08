package �������;

public class ��һ������ {
	/*ʵ�ֻ�ȡ��һ�����еĺ������㷨��Ҫ���������������������г��ֵ�������һ����������С�

	�����������һ����������У��������������г���С�����У����������У���

	����ԭ���޸ģ�ֻ����ʹ�ö��ⳣ���ռ䡣

	������һЩ���ӣ�����λ������У�����Ӧ���λ���Ҳ��С�
	1,2,3 �� 1,3,2
	3,2,1 �� 1,2,3
	1,1,5 �� 1,5,1*/
	/*
	����β��ͷ���ǵ����ģ�������һ�����С�
	���ҵ����ǵ�һ�����ǵ�����������Ҫ����������
	�Ӻ󲿵������������ҵ���һ�����ڽ�������������С�ڽ����˱�С�ˣ�
	��Ϊ����������ǵ���������Ϊ������λ��λ���Ƚϴ��Ѿ���ԭ����
	β����������Ҫ��ݼ����У�С����ǰ�����ں������С�ġ�
	*/
	  public void nextPermutation(int[] nums) {
	        int i = nums.length - 2;
	        while (i >= 0 && nums[i + 1] <= nums[i]) {
	            i--;
	        }
	        if (i >= 0) {
	            int j = nums.length - 1;
	            while (j >= 0 && nums[j] <= nums[i]) {
	                j--;
	            }
	            swap(nums, i, j);
	        }
	        reverse(nums, i + 1);
	    }

	    private void reverse(int[] nums, int start) {
	        int i = start, j = nums.length - 1;
	        while (i < j) {
	            swap(nums, i, j);
	            i++;
	            j--;
	        }
	    }

	    private void swap(int[] nums, int i, int j) {
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }
}
