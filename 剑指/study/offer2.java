package study;
/*����һ����ά���飬��ÿһ�д����ҵ������򣬴��ϵ���Ҳ�ǵ������򡣸���һ�������ж�������Ƿ��ڸö�ά�����С�

Consider the following matrix:
[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]

Given target = 5, return true.
Given target = 20, return false.
*/
public class offer2 {

	public boolean find(int[][] matrix ,int target) {
		if(matrix==null||matrix.length==0||matrix[0].length==0) {
			 return false;
		}
			int rows =matrix.length;
			int cols=matrix[0].length;
			int r=0,c=cols-1;
			while(r<=rows-1&&c>=0) {
				if(target==matrix[r][c]) {
					return true;
				}
				else if(target<matrix[r][c]) {
					c=c-1;
				}
				else {
					r=r+1;
				}
			}
			return false;
}
			
		
		
		
		
	}
	
	
	
