// Last updated: 7/14/2026, 11:07:23 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int length = prices.length;
4        int[] min = new int[length];
5        int[] max = new int[length];
6        min[0] = prices[0];
7        max[length-1] = prices[length-1];
8        for(int i = 1; i < length; i++){
9            min[i] = Math.min(min[i-1], prices[i]);
10        }
11
12        for(int i = length - 2; i >= 0; i--){
13            max[i] = Math.max(max[i+1], prices[i]);
14        }
15
16        int maxV = 0;
17        for(int i = 0; i < prices.length; i++){
18            maxV = Math.max(maxV, max[i]-min[i]);
19        }
20
21        return maxV;
22    }
23}