package study2;

public class Offer14 {
	/*��һ�����Ӽ��ɶ�Σ�����ʹ��ÿ�εĳ��ȳ˻����

	n = 2
	return 1 (2 = 1 + 1)

	n = 10
	return 36 (10 = 3 + 3 + 4)*/
	
	/*̰��
	�����ܶ������Ϊ 3 �����ӣ����Ҳ������г���Ϊ 1 �����ӳ��֡�
	��������ˣ��ʹ��Ѿ��кó���Ϊ 3 ���������ó�һ���볤��Ϊ 1 ������������ϣ��������г����γ���Ϊ 2 �����ӡ�

	֤������ n >= 5 ʱ��3(n - 3) - n = 2n - 9 > 0���� 2(n - 2) - n = n - 4 > 0��
	����� n >= 5 ������£������Ӽ���һ��Ϊ 2 ���� 3���õ��ĳ˻������
	����Ϊ 3(n - 3) - 2(n - 2) = n - 5 >= 0�����Լ���һ�γ���Ϊ 3 �ȳ���Ϊ 2 �õ��ĳ˻�����*/
	public int integerBreak(int n) {
	    if (n < 2)
	        return 0;
	    if (n == 2)
	        return 1;
	    if (n == 3)
	        return 2;
	    int timesOf3 = n / 3;
	    if (n - timesOf3 * 3 == 1)
	        timesOf3--;
	    int timesOf2 = (n - timesOf3 * 3) / 2;
	    return (int) (Math.pow(3, timesOf3)) * (int) (Math.pow(2, timesOf2));
	}
	
//	��̬�滮
	public int breakMax(int n) {
		if(n<2)
			return 0;
		if(n==2)
			return 1;
		if(n==3)
			return 2;
		int[] value=new int[n+1];
		value[0]=0;
		value[1]=0;
		value[2]=1;
		value[3]=2;
		int max=0;
		for(int i=4;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				n=value[j]*value[i-j];
				if(n>max)
					max=n;
				value[i]=max;
			}
		}		
		return value[n]; 		
	}
	
}
