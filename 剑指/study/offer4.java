package study;

import java.util.ArrayList;
import java.util.Stack;

public class offer4 {
//	��β��ͷ��������ӡ��ÿ������ֵ��

	public ArrayList<Integer> printListFromTailToHead(ListNode listnode){
		Stack<Integer> stack=new Stack<>();
		ArrayList<Integer> list=new ArrayList<Integer>();
	    while(listnode!=null) {
	    	stack.push(listnode.val);
	    	listnode=listnode.next;
	    }
	    while(!stack.isEmpty()) {
	    	list.add(stack.pop());
	    }
	    return list;
		
}	
}
/*ʹ�õݹ�
public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    ArrayList<Integer> ret = new ArrayList<>();
    if (listNode != null) {
        ret.addAll(printListFromTailToHead(listNode.next));
        ret.add(listNode.val);
    }
    return ret;
}*/



/*��������ͷ�巨Ϊ������ص㡣

ͷ���͵�һ���ڵ������

ͷ�������ͷ�巨��ʹ�õ�һ������ڵ㣬����ڵ㲻�洢ֵ��
��һ���ڵ��������ĵ�һ�������洢ֵ�Ľڵ㡣*/

/*public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    // ͷ�巨������������
    ListNode head = new ListNode(-1);
    while (listNode != null) {
        ListNode memo = listNode.next;
        listNode.next = head.next;
        head.next = listNode;
        listNode = memo;
    }
    // ���� ArrayList
    ArrayList<Integer> ret = new ArrayList<>();
    head = head.next;
    while (head != null) {
        ret.add(head.val);
        head = head.next;
    }
    return ret;
}*/
