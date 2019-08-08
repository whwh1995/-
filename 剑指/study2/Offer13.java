package study2;

public class Offer13 {
	/*������һ�� m �к� n �еķ���һ�������˴����� (0, 0) �ĸ��ӿ�ʼ�ƶ���ÿһ��ֻ�������������ĸ������ƶ�һ��
	���ǲ��ܽ�������������������λ֮�ʹ��� k �ĸ��ӡ�

	���磬�� k Ϊ 18 ʱ���������ܹ����뷽�� (35,37)����Ϊ 3+5+3+7=18��
	���ǣ������ܽ��뷽�� (35,38)����Ϊ 3+5+3+8=19�����ʸû������ܹ��ﵽ���ٸ����ӣ�*/
private  static final int[][] next= {{0,-1},{0,1},{-1,0},{1,0}};
private int count=0;
private int rows;
private int cols;
private int limit;
public int moving(int limit, int rows,int cols) {
		this.limit=limit;
		this.rows=rows;
		this.cols=cols;
		boolean[][] marked=new boolean[rows][cols];
		dfs(marked,0,0);
		return count;
	}
private void dfs(boolean[][] marked,int r, int c) {
		if(r<0||r>=rows||c<0||c>=cols||marked[r][c]) //ע��Խ�����
			return;
		marked[r][c]=true;
		int sum=getSum(r,c);
		if(sum>limit)
			return;
		count++;
		for(int[] n:next) {
			dfs(marked,r+n[0],c+n[1]);
		}
	}
private int getSum(int r, int c) {
		int sum=0;
		while(r>0) {
			sum+=r%10;
			r=r/10;
		}
		while(c>0) {
			sum+=c%10;
			c=c/10;
		}
		return sum;
	}
}


/*private static final int[][] next = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
private int cnt = 0;
private int rows;
private int cols;
private int threshold;
private int[][] digitSum;

public int movingCount(int threshold, int rows, int cols) {
    this.rows = rows;
    this.cols = cols;
    this.threshold = threshold;
    initDigitSum();
    boolean[][] marked = new boolean[rows][cols];
    dfs(marked, 0, 0);
    return cnt;
}

private void dfs(boolean[][] marked, int r, int c) {
    if (r < 0 || r >= rows || c < 0 || c >= cols || marked[r][c])
        return;
    marked[r][c] = true;
    if (this.digitSum[r][c] > this.threshold)
        return;
    cnt++;
    for (int[] n : next)
        dfs(marked, r + n[0], c + n[1]);
}

private void initDigitSum() {
    int[] digitSumOne = new int[Math.max(rows, cols)];
    for (int i = 0; i < digitSumOne.length; i++) {
        int n = i;
        while (n > 0) {
            digitSumOne[i] += n % 10;
            n /= 10;
        }
    }
    this.digitSum = new int[rows][cols];
    for (int i = 0; i < this.rows; i++)
        for (int j = 0; j < this.cols; j++)
            this.digitSum[i][j] = digitSumOne[i] + digitSumOne[j];
}*/