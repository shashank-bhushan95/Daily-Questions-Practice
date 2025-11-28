// Last updated: 11/28/2025, 10:44:54 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int[] left = new int[prices.length];
4        int right[] = new int[prices.length];
5        left[0] = prices[0];
6        right[prices.length-1] = prices[prices.length-1];
7        for(int i = 1; i < prices.length; i++){
8            left[i] = Math.min(left[i-1], prices[i]);
9        }
10        for(int i = prices.length-2; i >= 0; i--){
11            right[i] = Math.max(right[i+1], prices[i]);
12        }
13        int max = 0;
14        for(int i = 0; i < prices.length; i++){
15            max = Math.max(max, right[i]-left[i]);
16        }
17        return max;
18
19    }
20}