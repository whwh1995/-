package �ַ�������;
/*����һ���ַ��� S��һ���ַ��� T�������ַ��� S �����ҳ������� T ������ĸ����С�Ӵ���

ʾ����

����: S = "ADOBECODEBANC", T = "ABC"
���: "BANC"
˵����

��� S �в����������Ӵ����򷵻ؿ��ַ��� ""��
��� S �д����������Ӵ������Ǳ�֤����Ψһ�Ĵ𰸡�
*/
public class ��С�����Ӵ� {
	class Solution {
	    public String minWindow(String s, String t) {
	        char[] sChars = s.toCharArray();
	        char[] pChars = t.toCharArray();
	        int[] pMap = new int[128];
	        int i = 0, j = 0; // ���촰��[i,j-1]
	        int count = pChars.length;
	        int minLen = s.length() + 1,l = 0,r = 0;
	        for (char pChar : pChars)
	            pMap[pChar]++;
	        while (j < sChars.length) {
	            //��С����
	            if (pMap[sChars[j]] > 0)
	                count--;
	            pMap[sChars[j]]--;
	            j++;
	            //����Ϊ 0˵������[i,j-1] ���� p
	            while (count == 0) {
	                //���һ����
	                if (j - i < minLen) {
	                    minLen = j - i;
	                    l = i;
	                    r = j;
	                }
	                pMap[sChars[i]]++;
	                // ���Ӽ���
	                if (pMap[sChars[i]] > 0)
	                    count++;
	                i++;
	            }
	        }
	        return minLen == s.length() + 1 ? "" : s.substring(l, r);
	    }

	}
}
