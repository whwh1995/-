package ����;

public class �����Ӵ� {
	/*����һ���ַ�������������Ǽ�������ַ������ж��ٸ������Ӵ���

	���в�ͬ��ʼλ�û����λ�õ��Ӵ�����ʹ������ͬ���ַ���ɣ�Ҳ�ᱻ��Ϊ�ǲ�ͬ���Ӵ���

	ʾ�� 1:

	����: "abc"
	���: 3
	����: ���������Ӵ�: "a", "b", "c".
	ʾ�� 2:

	����: "aaa"
	���: 6
	˵��: 6�������Ӵ�: "a", "a", "a", "aa", "aa", "aaa".*/
	   int num = 0;
	    public int countSubstrings(String s) {
	        for (int i=0; i < s.length(); i++){
	            count(s, i, i);//���Ĵ�����Ϊ����
	            count(s, i, i+1);//���Ĵ�����Ϊż��
	        }
	        return num;
	    }
	    
	    public void count(String s, int start, int end){
	        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
	            num++;
	            start--;
	            end++;
	        }
	    }
}
