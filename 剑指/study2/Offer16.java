package study2;

public class Offer16 {
//����һ�� double ���͵ĸ����� base �� int ���͵����� exponent���� base �� exponent �η���
//	Ӧ�ÿ��� �η����������Ǹ�����ͬʱ����ʱ��Ҫ���ǵ����Ƿ�Ϊ0����Ϊ0�ĸ��η�Ϊ���壻
	
/*	��ΪX^n=x^n/2+x*n/2 n%2=0
	    X^n=x^n/2+x*n/2*x n%2=1	
	    ���Կ��Կ��ǵݹ�
*/	public double Power(double base, int exponent) {
	    if (exponent == 0)
	        return 1;
	    if (exponent == 1)
	        return base;
	    boolean isNegative = false;
	    if (exponent < 0) {
	        exponent = -exponent;
	        isNegative = true;
	    }
	    double pow = Power(base * base, exponent / 2);
	    if (exponent % 2 != 0)
	        pow = pow * base;
	    return isNegative ? 1 / pow : pow;
	}
}
