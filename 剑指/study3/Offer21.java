package study3;

public class Offer21 {
//����һ���������飬ͨ������ʹ������������ż��ǰ�档
	
	
	public void reOrderArray(int[] nums) {
		int mid=0;
		if(nums==null||nums.length==1)
			return;
		int begin=0;
		int last=nums.length-1;
		for(;;) {
			while(nums[begin]%2!=0) {  //�˴����ж�����������һ��������ȡ��������Ӧ����������Ĳ�ͬ����
				begin++;
			}
			while(nums[last]%2==0) {
				last--;
			}
			if(begin<last) {
			   mid =nums[begin];
			   nums[begin]=nums[last];
			   nums[last]=mid;
			}else {
				return;
						}
			
		    	  
	}
}
}
