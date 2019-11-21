package �ַ�������;

public class �Ƿ�����ַ��� {
	/*�ַ���������
	���������ַ��� s1 �� s2��дһ���������ж� s2 �Ƿ���� s1 �����С�

	���仰˵����һ���ַ���������֮һ�ǵڶ����ַ������Ӵ���

	ʾ��1:

	����: s1 = "ab" s2 = "eidbaooo"
	���: True
	����: s2 ���� s1 ������֮һ ("ba").
	 

	ʾ��2:

	����: s1= "ab" s2 = "eidboaoo"
	���: False*/
	class Solution {
	    public boolean checkInclusion(String s1, String s2) {
	       if(s1 == null || s2 == null || s1.length()>s2.length()) 
	           return false;
	        int [] dif = new int[26];
	        for(int i = 0;i<s1.length();i++){
	            dif[s1.charAt(i)-'a'] --;
	            dif[s2.charAt(i)-'a'] ++;
	        }
	        for(int j = s1.length();j<s2.length();j++){
	            if(isSame(dif)){
	              return true;  
	            }
	            dif[s2.charAt(j-s1.length())-'a'] --;
	            dif[s2.charAt(j) - 'a']++;
	        }
	        return isSame(dif);
	    }
	    
	    public boolean isSame(int []dif){
	        for(int i = 0;i<dif.length;i++){
	            if(dif[i]!=0){
	                return false;
	            }
	        }
	        return true;
	    }
	}
}
