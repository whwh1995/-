package study;

import java.util.Stack;

public class Offer9 {
//	������ջ��ʵ��һ�����У���ɶ��е� Push �� Pop ������
	Stack<Integer> stack1=new Stack<Integer>();
	Stack<Integer> stack2=new Stack<Integer>();
	
	public void push(int i) {
		stack1.add(i);
	}
	public int pop() throws Exception {
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.add(stack1.pop());
			}
		}
		if(stack2.empty()) {
			throw new Exception("queue is empty!");
		}
		return stack2.pop();
	}
	
	
	
}
