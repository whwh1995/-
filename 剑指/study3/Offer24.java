package study3;

public class Offer24 {
//	 ��ת����
	public ListNode ReverseList(ListNode head) { //�ݹ�
	    if (head == null || head.next == null)
	        return head;
	    ListNode next = head.next;
	    head.next = null;
	    ListNode newHead = ReverseList(next);
	    next.next = head;
	    return newHead;
	}
	public ListNode ReverseList1(ListNode head) {//����
	    ListNode newList = new ListNode(-1);
	    while (head != null) {
	        ListNode next = head.next;
	        head.next = newList.next;
	        newList.next = head;
	        head = next;
	    }
	    return newList.next;
	}
}
