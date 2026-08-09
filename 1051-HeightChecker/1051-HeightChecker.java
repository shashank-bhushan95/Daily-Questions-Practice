// Last updated: 8/9/2026, 2:52:33 PM
1class Solution {
2    public int heightChecker(int[] heights) {
3        int[] freq = new int[101];
4        for (int h : heights) {
5            freq[h]++;
6        }
7
8        int ans = 0;
9        int index = 0;
10        for (int h = 1; h <= 100; h++) {
11            while (freq[h] > 0) {
12                if (heights[index] != h) {
13                    ans++;
14                }
15                index++;
16                freq[h]--;
17            }
18        }
19        return ans;
20    }
21}