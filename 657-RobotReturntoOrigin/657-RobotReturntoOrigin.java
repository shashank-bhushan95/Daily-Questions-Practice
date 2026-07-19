// Last updated: 7/19/2026, 3:17:19 PM
1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        int max = 0;
4        for(int i = 0; i < accounts.length; i++){
5            int sum = 0;
6            for(int j = 0; j < accounts[0].length; j++){
7                sum += accounts[i][j];
8            }
9            max = Math.max(max, sum);
10        }
11        return max;
12    }
13}