package study4;

import java.util.Stack;

public class Offer30 {
//	����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��СԪ�ص� min ������
//	ʹ�ø���ջ
	private Stack<Integer> dataStack=new Stack<Integer>();
	private Stack<Integer> minStack=new Stack<Integer>();
	public void push(int node) {
		    dataStack.push(node);
		    minStack.push(minStack.isEmpty() ? node : Math.min(minStack.peek(), node));
		}

		public void pop() {
		    dataStack.pop();
		    minStack.pop();
		}

		public int top() {
		    return dataStack.peek();
		}

		public int min() {
		    return minStack.peek();
		}
	}
