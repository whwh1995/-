package Study6;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Offer59 {
	/*����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ��

	���磬����������� {2, 3, 4, 2, 6, 2, 5, 1} ���������ڵĴ�С 3����ôһ������ 6 ���������ڣ����ǵ����ֵ�ֱ�Ϊ {4, 4, 6, 6, 6, 5}��
	*/
	public ArrayList<Integer> maxInWindows(int[] num, int size) {
	    ArrayList<Integer> ret = new ArrayList<>();
	    if (size > num.length || size < 1)
	        return ret;
	    PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> o2 - o1);  /* �󶥶� */
	    for (int i = 0; i < size; i++)
	        heap.add(num[i]);
	    ret.add(heap.peek());
	    for (int i = 0, j = i + size; j < num.length; i++, j++) {            /* ά��һ����СΪ size �Ĵ󶥶� */
	        heap.remove(num[i]);
	        heap.add(num[j]);
	        ret.add(heap.peek());
	    }
	    return ret;
	}
}
