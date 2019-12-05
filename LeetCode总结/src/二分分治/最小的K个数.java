package ���ַ���;

import java.util.ArrayList;

public class ��С��K���� {
//	��С�� K ����
/*	����ѡ��
	���Ӷȣ�O(N) + O(1)
	ֻ�е������޸�����Ԫ��ʱ�ſ���ʹ��*/
	public ArrayList<Integer> GetLeastNumbers_Solution(int[] nums, int k) {
	    ArrayList<Integer> ret = new ArrayList<>();
	    if (k > nums.length || k <= 0)
	        return ret;
	    findKthSmallest(nums, k - 1);
	    /* findKthSmallest ��ı����飬ʹ��ǰ k ����������С�� k ���� */
	    for (int i = 0; i < k; i++)
	        ret.add(nums[i]);
	    return ret;
	}

	public void findKthSmallest(int[] nums, int k) {
	    int l = 0, h = nums.length - 1;
	    while (l < h) {
	        int j = partition(nums, l, h);
	        if (j == k)
	            break;
	        if (j > k)
	            h = j - 1;
	        else
	            l = j + 1;
	    }
	}

	private int partition(int[] nums, int l, int h) {
	    int p = nums[l];     /* �з�Ԫ�� */
	    int i = l, j = h + 1;
	    while (true) {
	        while (i != h && nums[++i] < p) ;
	        while (j != l && nums[--j] > p) ;
	        if (i >= j)
	            break;
	        swap(nums, i, j);
	    }
	    swap(nums, l, j);
	    return j;
	}

	private void swap(int[] nums, int i, int j) {
	    int t = nums[i];
	    nums[i] = nums[j];
	    nums[j] = t;
	}
}
