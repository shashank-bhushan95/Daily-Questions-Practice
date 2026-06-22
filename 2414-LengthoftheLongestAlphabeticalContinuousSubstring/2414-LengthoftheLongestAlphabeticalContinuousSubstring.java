// Last updated: 6/22/2026, 10:57:14 AM
1class Solution {
2    public int longestContinuousSubstring(String s) {
3        int ans = 1;
4        int count = 1;
5        for(int i = 0; i < s.length()-1; i++){
6            int asciiValue1 = (int) s.charAt(i);
7            int asciiValue2 = (int) s.charAt(i+1);
8            if(asciiValue2 - asciiValue1 == 1){
9                count++;
10                ans = Math.max(count, ans);
11            }
12            else{
13                count = 1;
14            }
15        }
16        return ans;
17    }
18}