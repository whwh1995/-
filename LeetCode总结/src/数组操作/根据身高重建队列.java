package �������;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ��������ؽ����� {
	/*�����д���˳���һȺ��վ��һ�����С� ÿ������һ��������(h, k)��ʾ������h������˵���ߣ�k�����������ǰ������ߴ��ڻ����h�������� ��дһ���㷨���ؽ�������С�

	ע�⣺
	����������1100�ˡ�

	ʾ��

	����:
	[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]

	���:
	[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
*/
	public int[][] reconstructQueue(int[][] people) {
        if (people==null ||  people.length==0||people[0].length==0)
            return new int[0][0];
         //������߽��� K�������� 
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        //Kֵ����Ϊ ����hǰ������ߴ��ڻ����h������ 
        //��Ϊ����߽���ʼ���룬��ʱ��������߶����ڵ���h
        //���Kֵ��Ϊ��Ҫ�����λ��
        for (int[] i : people) {
            list.add(i[1], i);
        }
        return list.toArray(new int[list.size()][]);

    }
}
