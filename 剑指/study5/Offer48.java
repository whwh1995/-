package study5;

import java.util.Arrays;

public class Offer48 {
	/*����һ���ַ�����ֻ���� a~z ���ַ���������������ظ��ַ������ַ����ĳ��ȡ�
	������� arabcacfr��������ظ��ַ������ַ���Ϊ acfr������Ϊ 4��*/
	public int longestSubStringWithoutDuplication(String str) {
	    int curLen = 0;
	    int maxLen = 0;
	    int[] preIndexs = new int[26];
	    Arrays.fill(preIndexs, -1);
	    for (int curI = 0; curI < str.length(); curI++) {
	        int c = str.charAt(curI) - 'a';
	        int preI = preIndexs[c];
	        if (preI == -1 || curI - preI > curLen) {
	            curLen++;
	        } else {
	            maxLen = Math.max(maxLen, curLen);
	            curLen = curI - preI;
	        }
	        preIndexs[c] = curI;
	    }
	    maxLen = Math.max(maxLen, curLen);
	    return maxLen;
	}
//	����һ���ַ�����������������ַ�������������ַ���abc
	
	void findAllSubstrings(String str,int length){
		for(int i = 0 ; i < length ; i++ ){
			for(int j = 1 ; j <= length - i ; j++ ){
				String sub = str.substring(i, i+j);
				System.out.println(sub);
			}
		}
	}

}
