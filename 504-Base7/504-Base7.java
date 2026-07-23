// Last updated: 7/23/2026, 3:09:49 PM
1class Solution {
2    public String[] findRelativeRanks(int[] score) {
3        int n = score.length;
4        int[] arr = score.clone();
5        Arrays.sort(arr);
6        HashMap<Integer, Integer> map = new HashMap<>();
7
8        int rank = 1;
9        for (int i = n - 1; i >= 0; i--) {
10            map.put(arr[i], rank);
11            rank++;
12        }
13        String[] ans = new String[n];
14        for (int i = 0; i < n; i++) {
15            int r = map.get(score[i]);
16            if (r == 1) {
17                ans[i] = "Gold Medal";
18            } else if (r == 2) {
19                ans[i] = "Silver Medal";
20            } else if (r == 3) {
21                ans[i] = "Bronze Medal";
22            } else {
23                ans[i] = String.valueOf(r);
24            }
25        }
26
27        return ans;
28    }
29}