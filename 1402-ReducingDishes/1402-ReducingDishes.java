// Last updated: 4/8/2026, 2:29:13 PM
1class Solution {
2    public int maxSatisfaction(int[] arr) {
3        int max = 0;
4        Arrays.sort(arr);
5
6        for(int i = 0; i < arr.length; i++){
7            int time = 1;
8            int sum = 0;
9
10            for(int j = i; j < arr.length; j++){
11                sum = sum + arr[j] * time;
12                max = Math.max(max, sum);
13                time++;
14            }
15        }
16        return max;
17    }
18}