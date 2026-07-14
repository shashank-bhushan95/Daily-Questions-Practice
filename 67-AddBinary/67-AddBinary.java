// Last updated: 7/14/2026, 11:09:15 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        if (prices == null || prices.length == 0) {
4            return 0;
5        }
6
7        int minPrice = prices[0];
8        int maxProfit = 0;
9
10        for (int i = 1; i < prices.length; i++) {
11            int currentProfit = prices[i] - minPrice;
12            maxProfit = Math.max(maxProfit, currentProfit);
13            minPrice = Math.min(minPrice, prices[i]);
14        }
15
16        return maxProfit;
17    }
18}