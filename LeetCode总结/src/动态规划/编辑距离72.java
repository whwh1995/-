package 动态规划;

public class 编辑距离72 {
	/*给定两个单词 word1 和 word2，计算出将 word1 转换成 word2 所使用的最少操作数 。

	你可以对一个单词进行如下三种操作：

	插入一个字符
	删除一个字符
	替换一个字符
	示例 1:

	输入: word1 = "horse", word2 = "ros"
	输出: 3
	解释: 
	horse -> rorse (将 'h' 替换为 'r')
	rorse -> rose (删除 'r')
	rose -> ros (删除 'e')
	示例 2:

	输入: word1 = "intention", word2 = "execution"
	输出: 5
	解释: 
	intention -> inention (删除 't')
	inention -> enention (将 'i' 替换为 'e')
	enention -> exention (将 'n' 替换为 'x')
	exention -> exection (将 'n' 替换为 'c')
	exection -> execution (插入 'u')*/
public int minDistance(String word1, String word2) {
	 int n=word1.length();
     int m=word2.length();
     if(n*m==0){
         return n+m;
     }
     int [][] dp=new int[n+1][m+1];
     for(int i=0;i<=n;i++){
         dp[i][0]=i;
     }
     for(int i=0;i<=m;i++){
         dp[0][i]=i;
     }
     for(int i=1;i<=n;i++){
         for(int j=1;j<=m;j++){
             int down=dp[i-1][j]+1;
             int left=dp[i][j-1]+1;
             int ld=dp[i-1][j-1];
             if(word1.charAt(i-1)!=word2.charAt(j-1))
                 ld=ld+1;
             dp[i][j]=Math.min(Math.min(down,left),ld);
         }
     }
     return dp[n][m];

}
}
