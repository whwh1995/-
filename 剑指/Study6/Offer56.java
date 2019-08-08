package Study6;

public class Offer56 {
//	�����������飬��������Ԫ��֮�⣬ÿ��Ԫ�ض����ֶ��Ρ� �ҵ�������ֻ����һ�ε���
	public void FindNumsAppearOnce(int[] nums, int num1[], int num2[]) {
	    int diff = 0;
	    for (int num : nums)
	        diff ^= num;
	    diff &= -diff;
	    for (int num : nums) {
	        if ((num & diff) == 0)
	            num1[0] ^= num;
	        else
	            num2[0] ^= num;
	    }
	}
//	�����������飬����һ��Ԫ��֮�⣬ÿ��Ԫ�ض��������Ρ� �ҵ��Ǹ�ֻ����һ�ε���
	 public int singleNumber(int[] nums) {
	        // ��ÿһλ����ͳ�Ƴ���1�Ĵ���, ������ֵĴ�����������3˵��Ψһ���ڵ�������һλ��Ϊ1, ʱ�临�Ӷ�O(32N)
	        int ret = 0;
	        for(int i = 0; i < 32; ++i) {
	            int bitnums = 0;
	            int bit = 1 << i;
	            for(int num : nums) {
	                if((num&bit) != 0)
	                    bitnums++;
	            }
	            if(bitnums % 3 != 0)
	                ret |= bit;
	        }
	        return ret;
	    }
}
