package study;

import java.util.Arrays;

public class Offerten {
//	��쳲��������еĵ� n �n <= 39��
	public static void main(String[] args) {
		int x =findFibonacci(4);
		System.out.println(x);
	}
	public static int findFibonacci(int n) {
		if(n<=1) {
			return n;
		}
		int start=0;
		int last=1;
		int fibo=0;
		for(int i=2;i<=n;i++){
			fibo=start+last;
			start=last;
			last=fibo;
		}
		return fibo;
	}

//������̨�׺�С���θ��Ǵ���ζ���쳲���������

//���ǿ����� 2*1 ��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ������� n �� 2*1 ��С�������ص��ظ���һ�� 2*n �Ĵ���Σ��ܹ��ж����ַ�����
public int RectCover(int n) {
    if (n <= 2)
        return n;
    int pre2 = 1, pre1 = 2;
    int result = 0;
    for (int i = 3; i <= n; i++) {
        result = pre2 + pre1;
        pre2 = pre1;
        pre1 = result;
    }
    return result;
}
//һֻ����һ�ο������� 1 ��̨�ף�Ҳ�������� 2 ���������������һ�� n ����̨���ܹ��ж���������
public int JumpFloor(int n) {
    if (n <= 2)
        return n;
    int pre2 = 1, pre1 = 2;
    int result = 1;

    for (int i = 2; i < n; i++) {
        result = pre2 + pre1;
        pre2 = pre1;
        pre1 = result;
    }
    return result;
}
//ֻ����һ�ο������� 1 ��̨�ף�Ҳ�������� 2 ��... ��Ҳ�������� n ���������������һ�� n ����̨���ܹ��ж���������
//��̬�滮
public int JumpFloorII(int target) {
    int[] dp = new int[target];
    Arrays.fill(dp, 1);
    for (int i = 1; i < target; i++)
        for (int j = 0; j < i; j++)
            dp[i] += dp[j];
    return dp[target - 1];
}
/*���� n-1 ��̨�ף����Դ� n-2 ���� 1 ����ȥ��Ҳ���Դ� n-3 ���� 2 ����ȥ...����ô

f(n-1) = f(n-2) + f(n-3) + ... + f(0)
ͬ�������� n ��̨�ף����Դ� n-1 ���� 1 ����ȥ��Ҳ���Դ� n-2 ���� 2 ����ȥ... ����ô

f(n) = f(n-1) + f(n-2) + ... + f(0)
���Ͽɵ�

f(n) - f(n-1) = f(n-1)
��

f(n) = 2*f(n-1)
���� f(n) ��һ���ȱ�����*/

public int JumpFloorII2(int target) {
    return (int) Math.pow(2, target - 1);
}






















}