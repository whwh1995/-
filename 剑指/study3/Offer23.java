package study3;

public class Offer23 {
//	һ�������а����������ҳ�������Ļ�����ڽ�㡣Ҫ����ʹ�ö���Ŀռ䡣
	/*ʹ��˫ָ�룬һ��ָ�� fast ÿ���ƶ������ڵ㣬һ��ָ�� slow ÿ���ƶ�һ���ڵ㡣
	��Ϊ���ڻ�����������ָ��ض������ڻ��е�ĳ���ڵ��ϡ�
	��������������ͼ�� z1 λ�ã���ʱ fast �ƶ��Ľڵ���Ϊ x+2y+z��slow Ϊ x+y��
	���� fast �ٶȱ� slow ��һ������� x+2y+z=2(x+y)���õ� x=z��

�������㣬slow Ҫ��������ڵ㻹��Ҫ�ƶ� z ���ڵ㣬����� fast ���´�ͷ��ʼ�ƶ��������ٶȱ�Ϊÿ���ƶ�һ���ڵ㣬
��ô��������ڵ㻹��Ҫ�ƶ� x ���ڵ㡣�������Ѿ��Ƶ��� x=z����� fast �� slow ���ڻ���ڵ�������*/
	public ListNode EntryNodeOfLoop(ListNode pHead) {
	    if (pHead == null || pHead.next == null)
	        return null;
	    ListNode slow = pHead, fast = pHead;
	    do {
	        fast = fast.next.next;
	        slow = slow.next;
	    } while (slow != fast);
	    fast = pHead;
	    while (slow != fast) {
	        slow = slow.next;
	        fast = fast.next;
	    }
	    return slow;
	}
}
