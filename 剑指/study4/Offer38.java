package study4;

import java.util.ArrayList;
import java.util.Arrays;

public class Offer38 {
	/*����һ���ַ��������ֵ����ӡ�����ַ������ַ����������С�
	���������ַ��� abc�����ӡ�����ַ� a, b, c �������г����������ַ��� abc, acb, bac, bca, cab �� cba��*/
	private ArrayList<String> ret = new ArrayList<>();

	public ArrayList<String> Permutation(String str) {
	    if (str.length() == 0)
	        return ret;
	    char[] chars = str.toCharArray();
	    Arrays.sort(chars);
	    backtracking(chars, new boolean[chars.length], new StringBuilder());
	    return ret;
	}

	private void backtracking(char[] chars, boolean[] hasUsed, StringBuilder s) {
	    if (s.length() == chars.length) {
	        ret.add(s.toString());
	        return;
	    }
	    for (int i = 0; i < chars.length; i++) {
	        if (hasUsed[i])
	            continue;
	        if (i != 0 && chars[i] == chars[i - 1] && !hasUsed[i - 1]) /* ��֤���ظ� */
	            continue;
	        hasUsed[i] = true;
	        s.append(chars[i]);
	        backtracking(chars, hasUsed, s);
	        s.deleteCharAt(s.length() - 1);
	        hasUsed[i] = false;
	    }
	}
//	ȫ���
	/*����˼·����ȫ��ϣ������ԭ��Ԫ��n������������Ͻ����2^n����ԭ���ǣ�
     * ��λ��������������Ԫ��ԭ���У�a,b,c��������1��ʾȡ��Ԫ�أ�0��ʾ��ȡ����ȥa����001��ȡab����011.
     * ����һ����λ��ÿ��λ��������ѡ��0,1.������2^n�������
     * ��Щ�����λͼֵ����0,1,2....2^n�����Կ�������ȫ���һ������ֵ0��ֵ2^n����������������
     * 000,001,010,011,100,101,110,111 ����Ӧ�����Ͻ��Ϊ��
    ��,a, b ,ab,c,ac,bc,abc.
    ������˳��պø�����0~2^n�������˳��һ��
    ȡ���Ķ���������ʵ���Ǵ�0��2^n-1��ʮ������
    */
	 /*ȫ��ϣ�https://www.cnblogs.com/lifegoesonitself/p/3225803.html
	  *    * ˼·�����ö����Ƶ����ԣ�ÿ�μ�1���ɱ�������λ�Ĳ�ͬ������ܺ����
        ����ͬ��
            */
	public static void combination1() {
       
        String arr[] = { "a", "b", "c"};
        int all = arr.length;
        int nbit = 1 << all;
        for (int i = 0; i < nbit; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < all; j++) {
                if ((i & (1 << j)) != 0) {
                    sb.append(arr[j]);
                }
            }
            System.out.println(sb);
        }
}
}

