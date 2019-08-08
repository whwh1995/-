package study5;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Offer41 {
	/*��εõ�һ���������е���λ����
	������������ж�����������ֵ����ô��λ������������ֵ����֮��λ���м����ֵ��
	������������ж���ż������ֵ����ô��λ������������ֵ����֮���м���������ƽ��ֵ��*/
	private PriorityQueue<Integer> left = new PriorityQueue<>((o1, o2) -> o2 - o1);
	/* С���ѣ��洢�Ұ��Ԫ�أ������Ұ��Ԫ�ض��������� */
	private PriorityQueue<Integer> right = new PriorityQueue<>();
	/* ��ǰ�����������Ԫ�ظ��� */
	private int N = 0;

	public void Insert(Integer val) {
	    /* ����Ҫ��֤�����Ѵ���ƽ��״̬ */
	    if (N % 2 == 0) {
	        /* N Ϊż��������²��뵽�Ұ�ߡ�
	         * ��Ϊ�Ұ��Ԫ�ض�Ҫ�������ߣ������²����Ԫ�ز�һ��������Ԫ�����Ĵ�
	         * �����Ҫ�Ƚ�Ԫ�ز������ߣ�Ȼ����������Ϊ�󶥶ѵ��ص㣬ȡ���Ѷ�Ԫ�ؼ�Ϊ���Ԫ�أ���ʱ�����Ұ�� */
	        left.add(val);
	        right.add(left.poll());
	    } else {
	        right.add(val);
	        left.add(right.poll());
	    }
	    N++;
	}

	public Double GetMedian() {
	    if (N % 2 == 0)
	        return (left.peek() + right.peek()) / 2.0;
	    else
	        return (double) right.peek();
	}
	/*��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ���
	���磬�����ַ�����ֻ����ǰ�����ַ� "go" ʱ����һ��ֻ����һ�ε��ַ��� "g"��
	���Ӹ��ַ����ж���ǰ�����ַ���google" ʱ����һ��ֻ����һ�ε��ַ��� "l"��
*/	
	private int[] cnts = new int[256];
	private Queue<Character> queue = new LinkedList<>();

	public void Insert(char ch) {
	    cnts[ch]++;
	    queue.add(ch);
	    while (!queue.isEmpty() && cnts[queue.peek()] > 1)
	        queue.poll();
	}

	public char FirstAppearingOnce() {
	    return queue.isEmpty() ? '#' : queue.peek();
	}
	
	
	
}





