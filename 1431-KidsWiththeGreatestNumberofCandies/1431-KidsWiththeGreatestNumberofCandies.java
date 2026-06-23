// Last updated: 6/24/2026, 12:10:37 AM
1class Solution {
2    public int maxConsecutive(int bottom, int top, int[] special) {
3        Arrays.sort(special);
4        int ans = 0;
5        int startDiff = special[0] - bottom;
6        ans = Math.max(ans, startDiff);
7
8        int lastDiff = top - special[special.length-1];
9        ans = Math.max(ans, lastDiff);
10        for(int i = 0; i < special.length-1; i++){
11            int max = special[i+1] - special[i] -1;
12            ans = Math.max(ans, max);
13        }
14        return ans;
15    }
16}