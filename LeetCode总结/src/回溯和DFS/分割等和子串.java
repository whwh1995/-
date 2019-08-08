package 回溯和DFS;

import java.util.Arrays;

public class 分割等和子串 {
	/*给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。

	注意:

	每个数组中的元素不会超过 100
	数组的大小不会超过 200
	示例 1:

	输入: [1, 5, 11, 5]

	输出: true

	解释: 数组可以分割成 [1, 5, 5] 和 [11].
	 

	示例 2:

	输入: [1, 2, 3, 5]

	输出: false

	解释: 数组不能分割成两个元素和相等的子集.*/

	public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int n : nums){
            sum += n;
        }
        if (sum % 2 != 0){
            return false;
        }
        sum = sum>>>1;
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0 ;i--) {
            if (sum == nums[i]) 
            	return true;
            return dfs(nums, sum, i, nums[i]);
        }
        return false;
    }

    private boolean dfs(int[] nums, int sum, int row, int cur){
        for (int i = row - 1; i >= 0; i--){
            if (cur + nums[i] == sum) return true;
            if (cur + nums[i] > sum)  continue;
            if (dfs(nums, sum, i, cur + nums[i])) 
            	return true;
        }
        return false;
    }

}

