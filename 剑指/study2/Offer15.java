package study2;

public class Offer15 {
//	����һ��������������������Ʊ�ʾ�� 1 �ĸ�����
//	λ����
	public int NumberOf1(int n) {
	    int cnt = 0;
	    while (n != 0) {
	        cnt++;
	        n &= (n - 1);
	    }
	    return cnt;
	}
}
