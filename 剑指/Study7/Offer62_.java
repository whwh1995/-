package Study7;

import java.util.Hashtable;

public class Offer62_ {
	/*��С������Χ��һ����Ȧ��Ȼ�����ָ��һ���� m���ñ��Ϊ 0 ��С���ѿ�ʼ������
	ÿ�κ��� m-1 ���Ǹ�С����Ҫ���г��׸裬Ȼ���������Ʒ�����������ѡ������Ҳ��ٻص�Ȧ�У���������һ��С���ѿ�ʼ
	������ 0...m-1 ���� .... ������ȥ .... ֱ��ʣ�����һ��С���ѣ����Բ��ñ��ݡ�*/
	public int LastRemaining_Solution(int n, int m) {
	    if (n == 0)     /* ��������Ĵ��� */
	        return -1;
	    if (n == 1)     /* �ݹ鷵������ */
	        return 0;
	    return (LastRemaining_Solution(n - 1, m) + m) % n;
	}

}
