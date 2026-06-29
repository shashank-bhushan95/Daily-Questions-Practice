// Last updated: 6/30/2026, 12:11:16 AM
1class Solution {
2    public int flipgame(int[] fronts, int[] backs) {
3        // Since max possible card value is 2000, we use a fixed boolean array
4        boolean[] isBanned = new boolean[2001];
5        int n = fronts.length;
6
7        // Step 1: Identify and ban numbers that appear on both sides of the exact same card
8        for (int i = 0; i < n; i++) {
9            if (fronts[i] == backs[i]) {
10                isBanned[fronts[i]] = true;
11            }
12        }
13
14        int minValidNumber = Integer.MAX_VALUE;
15
16        // Step 2: Scan all numbers to find the smallest one that is not banned
17        for (int i = 0; i < n; i++) {
18            // Check front number
19            if (fronts[i] < minValidNumber && !isBanned[fronts[i]]) {
20                minValidNumber = fronts[i];
21            }
22            // Check back number
23            if (backs[i] < minValidNumber && !isBanned[backs[i]]) {
24                minValidNumber = backs[i];
25            }
26        }
27
28        // If minValidNumber wasn't updated, return 0; otherwise return the number
29        return minValidNumber == Integer.MAX_VALUE ? 0 : minValidNumber;
30    }
31}
32