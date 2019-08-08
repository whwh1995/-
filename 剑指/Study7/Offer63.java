package Study7;

public class Offer63 {
//	������һ�������һ����������ô���������ǰ����������档
	public int maxProfit(int[] prices) {
	    if (prices == null || prices.length == 0)
	        return 0;
	    int soFarMin = prices[0];
	    int maxProfit = 0;
	    for (int i = 1; i < prices.length; i++) {
	        soFarMin = Math.min(soFarMin, prices[i]);
	        maxProfit = Math.max(maxProfit, prices[i] - soFarMin);
	    }
	    return maxProfit;
	}
}
