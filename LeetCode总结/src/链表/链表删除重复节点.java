package ����;

public class ����ɾ���ظ��ڵ� {
//	 �� O(1) ʱ����ɾ������ڵ�
	
	
	
/*  �� ����ýڵ㲻��β�ڵ㣬��ô����ֱ�ӽ���һ���ڵ��ֵ�����ýڵ㣬Ȼ����ýڵ�ָ�����¸��ڵ�
	�� �������ֻ��һ���ڵ㣬��ôֱ��
	�� ���򣬾���Ҫ�ȱ��������ҵ��ڵ��ǰһ���ڵ㣬Ȼ����ǰһ���ڵ�ָ�� null��ʱ�临�Ӷ�Ϊ O(N)��
*/
	
	/*public class ListNode{
		ListNode next;
		int val;
		public ListNode(int i) {
			this.val=i;
		}
		
	}*/
	public ListNode deleteNode(ListNode head, ListNode tobeDelete) {
	    if (head == null || tobeDelete == null)
	        return null;
	    if (tobeDelete.next != null) {
	        // Ҫɾ���Ľڵ㲻��β�ڵ�
	        ListNode next = tobeDelete.next;
	        tobeDelete.val = next.val;
	        tobeDelete.next = next.next;
	    } else {
	        if (head == tobeDelete)
	             // ֻ��һ���ڵ�
	            head = null;
	        else {
	            ListNode cur = head;
	            while (cur.next != tobeDelete)
	                cur = cur.next;
	            cur.next = null;
	        }
	    }
	    return head;
	}
//	ɾ���������ظ��Ľ��
//	��һ������������У����ɾ���ظ��Ľڵ㡣
	public ListNode deleteDuplication(ListNode pHead) {
	    if (pHead == null || pHead.next == null)
	        return pHead;
	    ListNode next = pHead.next;
	    if (pHead.val == next.val) {
	        while (next!=null&&pHead.val == next.val) //�ص�,��Ϊ null.val �ᱨ��ָ���쳣��������Ҫnext��=null�жϣ�
	             next = next.next;
	        return deleteDuplication(next);
	    } else {
	        pHead.next = deleteDuplication(pHead.next);
	        return pHead;
	    }
	}
}
