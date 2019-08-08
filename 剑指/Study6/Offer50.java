package Study6;

import java.util.LinkedList;
import java.util.Queue;

public class Offer50 {
//	��һ���ַ������ҵ���һ��ֻ����һ�ε��ַ�������������λ�á�
	public int FirstNotRepeatingChar(String str) {
	    int[] cnts = new int[256];
	    for (int i = 0; i < str.length(); i++)
	        cnts[str.charAt(i)]++;
	    for (int i = 0; i < str.length(); i++)
	        if (cnts[str.charAt(i)] == 1)
	            return i;
	    return -1;
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
