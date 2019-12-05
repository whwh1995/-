package study5;

public class Offer46_____ {
//	�����ַ�����ַ���
	/*����һ�����֣��������¹�������ַ�����1 ����ɡ�a����2 ����ɡ�b��... 26 ����ɡ�z����
	һ�������ж��ַ�����ܣ����� 12258 һ���� 5 �֣��ֱ��� abbeh��lbeh��aveh��abyh��lyh��
	ʵ��һ����������������һ�������ж����ֲ�ͬ�ķ��뷽���� 
	 ԭ��ĿΪ0��ʼ��
	*/
	//�˴�f(i)Ϊǰiλ��f(i)�ַ�����f(i)=f(i-1)+g(i,i-1)f(i-2);
	public int numDecodings(String s) {
		if (s == null || s.length() == 0)
	        return 0;
	    int n = s.length();
	    int[] dp = new int[n + 1];
	    dp[0] = 1; //  ��ֵΪ1 ����Ϊ��2λ f(2)=f(1)+g(1,2)f(0);
	    dp[1] = s.charAt(0) == '0' ? 0 : 1;
	    for (int i = 2; i <= n; i++) {
	        int one = Integer.valueOf(s.substring(i - 1, i));
	        if (one != 0)
	            dp[i] += dp[i - 1];
	        if (s.charAt(i - 2) == '0')
	            continue;
	        int two = Integer.valueOf(s.substring(i - 2, i));
	        if (two <= 26)
	            dp[i] += dp[i - 2];
	    }
	    return dp[n];
	}
	//f(i)=f(i+1)+g(i,i+1)f(i+2)  ��̬�滮  ����ǰ���� ���ظ����㡣f(i)Ϊ�ӵ�iλ��ʼ��f(i)��
	public int getTranslationCount(int number) {
        if(number<0)
            return 0;
        String sNumber=String.valueOf(number);
        int len=sNumber.length();
        int[] counts=new int[len];
        for(int i=len-1;i>=0;i--) {
            if(i==len-1) {
                counts[i]=1;
            }else {
                counts[i]=counts[i+1];
                if(canBeTrans(sNumber,i)) {
                    if(i==len-2)
                        counts[i]+=1;
                    else
                        counts[i]+=counts[i+2];
                }
            }
        }
        return counts[0];
    }
 
    private boolean canBeTrans(String sNumber, int i) {
        int a=sNumber.charAt(i)-'0';
        int b=sNumber.charAt(i+1)-'0';
        int convert=a*10+b;
        if(convert>=10 && convert<=25)
            return true;
        return false;
    }
	
	
}
