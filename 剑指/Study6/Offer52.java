package Study6;

public class Offer52 {
//�������������ҳ����ǵĵ�һ�������ڵ㡣
	
/*�� A �ĳ���Ϊ a + c��B �ĳ���Ϊ b + c������ c Ϊβ���������ֳ��ȣ���֪ a + c + b = b + c + a��

���������� A ��ָ����ʵ�����β��ʱ������������ B ��ͷ�����¿�ʼ�������� B��
ͬ���أ����������� B ��ָ����ʵ�����β��ʱ������������ A ��ͷ�����¿�ʼ�������� A��
�������ܿ��Ʒ��� A �� B ���������ָ����ͬʱ���ʵ����㡣*/

public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    ListNode l1 = pHead1, l2 = pHead2;
    while (l1 != l2) {
        l1 = (l1 == null) ? pHead2 : l1.next;
        l2 = (l2 == null) ? pHead1 : l2.next;
    }
    return l1;
}
}
//2����������ջ��
//3.�����õ����ȣ����ӳټ����ƶ���