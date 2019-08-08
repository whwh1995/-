package study2;

public class Offer11 {
	/*��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת������һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�

	�������� {3, 4, 5, 1, 2} Ϊ {1, 2, 3, 4, 5} ��һ����ת�����������СֵΪ 1��
	*/
	public int findMin(int[] nums) throws Exception {
		if (nums==null)
			throw new Exception("invalid array");
		int index1=0;
		int index2=nums.length-1;
		int mid=index1;
		while(nums[index1]>=nums[index2]) {
			if(index2-index1==1) {
				mid=index2;
				break;
			}
			mid =(index1+index2)/2;
			if(nums[mid]>=nums[index1]) {
				index1=mid;
			}else {
				index2=mid;
			}
			/*�������Ԫ�������ظ��Ļ�����ô�ͻ����һ������������nums[l] == nums[m] == nums[h]��
			   ��ô��ʱ�޷�ȷ�������ĸ����䣬��Ҫ�л���˳����ҡ�
			  ����������� {1,1,1,0,1}��l��m �� h ָ�������Ϊ 1����ʱ�޷�֪����С���� 0 ���ĸ����䡣*/
			if(nums[index1]==nums[mid]&&nums[index2]==nums[mid]){
				return MinInOrder(nums,index1,index2);
			}
		}
		return nums[mid];	
	}
	public int MinInOrder(int[] nums,int index1,int index2) {
		int result=nums[index1];
		for(int i=index1;i<=index2;i++) {
			if(nums[i]<result) {
				result=nums[i];
			}
		}
		return result;
	}
}
