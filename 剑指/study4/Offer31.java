package study4;

import java.util.Stack;

public class Offer31 {
	/*���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳�򡣼���ѹ��ջ���������־�����ȡ�

	�������� 1,2,3,4,5 ��ĳջ��ѹ��˳������ 4,5,3,2,1 �Ǹ�ѹջ���ж�Ӧ��һ���������У��� 4,3,5,1,2 �Ͳ������Ǹ�ѹջ���еĵ������С�*/
	public boolean IsPopOrder(int[] pushSequence, int[] popSequence) {
		 int n = pushSequence.length;
		    Stack<Integer> stack = new Stack<>();
		    for (int pushIndex = 0, popIndex = 0; pushIndex < n; pushIndex++) {
		        stack.push(pushSequence[pushIndex]);
		        while (popIndex < n && !stack.isEmpty() 
		                && stack.peek() == popSequence[popIndex]) {
		            stack.pop();
		            popIndex++;
		        }
		    }
		    return stack.isEmpty();
	}
	
}
