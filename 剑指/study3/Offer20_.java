package study3;

public class Offer20_ {
	/*true

	"+100"
	"5e2"
	"-123"
	"3.1416"
	"-1E-16"

	false

	"12e"
	"1a3.14"
	"1.2.3"
	"+-5"
	"12e+4.3"*/
	
 /* []  �� �ַ�����
	()  �� ����
	?   �� �ظ� 0 ~ 1
	+   �� �ظ� 1 ~ n
	*   �� �ظ� 0 ~ n
	.   �� �����ַ�
	\\. �� ת���� .
	\\d �� ����
	*/
	public boolean isNumeric(char[] str) {
	    if (str == null || str.length == 0)
	        return false;
	    return new String(str).matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?");
	}
}
