package ���ַ���;

public class ƽ���� {
	public class Solution {

	    public int mySqrt(int x) {
	        long left = 0;
	        long right = Integer.MAX_VALUE;
	        while (left < right) {
	            // ����ȡ��λ���ķ����ֿ��ֺã����Ҹ�ѧ��ģ�ԭ����������ƪ���µ�������
	            // https://www.liwei.party/2019/06/17/leetcode-solution-new/search-insert-position/
	            // ע�⣺��������޷�������
	            long mid = (left + right + 1) >>> 1;
	            long square = mid * mid;
	            if (square > x) {
	                right = mid - 1;
	            } else {
	                left = mid;
	            }
	        }
	        return (int) left;
	    }
	}
//ţ�ٷ�
	
	public class niudun {

	    public int mySqrt(int a) {
	        long x = a;
	        while (x * x > a) {
	            x = (x + a / x) / 2;
	        }
	        return (int) x;
	    }
	}
}
