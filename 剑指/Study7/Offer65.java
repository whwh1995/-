package Study7;

public class Offer65 {
//	���üӼ��˳����ӷ�
	public int Add(int a, int b) {
	    return b == 0 ? a : Add(a ^ b, (a & b) << 1);
	}
}
