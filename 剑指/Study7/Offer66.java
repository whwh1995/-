package Study7;

public class Offer66 {
/*	����һ������ A[0, 1,..., n-1]���빹��һ������ B[0, 1,..., n-1]��
	���� B �е�Ԫ�� B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]��Ҫ����ʹ�ó�����*/
	public int[] multiply(int[] A) {
	    int n = A.length;
	    int[] B = new int[n];
	    for (int i = 0, product = 1; i < n; product *= A[i], i++)       /* ���������۳� */
	        B[i] = product;
	    for (int i = n - 1, product = 1; i >= 0; product *= A[i], i--)  /* ���������۳� */
	        B[i] *= product;
	    return B;
	}
}
