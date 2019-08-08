package ��������;

public class StringMuti {
	    public String multiply(String num1, String num2) {
	        /**
	        num1�ĵ�iλ(��λ��0��ʼ)��num2�ĵ�jλ��˵Ľ���ڳ˻��е�λ����[i+j, i+j+1]
	        ��: 123 * 45,  123�ĵ�1λ 2 ��45�ĵ�0λ 4 �˻� 08 ����ڽ���ĵ�[1, 2]λ��
	          index:    0 1 2 3 4  
	              
	                        1 2 3
	                    *     4 5
	                    ---------
	                          1 5
	                        1 0
	                      0 5
	                    ---------
	                      0 6 1 5
	                        1 2
	                      0 8
	                    0 4
	                    ---------
	                    0 5 5 3 5
	        �������ǾͿ��Ե�������ÿһλ������˼���ѽ��������Ӧ��index��        
	        **/
	        
	        int n1 = num1.length()-1;
	        int n2 = num2.length()-1;
	        if(n1 < 0 || n2 < 0) return "";
	        int[] mul = new int[n1+n2+2];
	        
	        for(int i = n1; i >= 0; --i) {
	            for(int j = n2; j >= 0; --j) {
	                int bitmul = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');      
	                bitmul += mul[i+j+1]; // �ȼӵ�λ�ж��Ƿ����µĽ�λ
	                
	                mul[i+j] += bitmul / 10;
	                mul[i+j+1] = bitmul % 10;
	            }
	        }
	        
	        StringBuilder sb = new StringBuilder();
	        int i = 0;
	        // ȥ��ǰ��0
	        while(i < mul.length-1 && mul[i] == 0) 
	            i++;
	        for(; i < mul.length; ++i)
	            sb.append(mul[i]);
	        return sb.toString();
	    }
	
}
