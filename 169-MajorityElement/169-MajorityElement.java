// Last updated: 6/18/2026, 12:36:14 AM
1class Solution {
2    public int maxPower(String s) {
3        int curr = 0;
4        int before =-1;
5        int ans = 0;
6        for(int i = 1; i < s.length(); i++){
7            if(s.charAt(i) == s.charAt(i-1)){
8                curr++;
9                int count = curr - before;
10                if(count > ans){
11                    ans = count;
12                }
13            }
14            else{
15                curr++;
16                before = i-1;
17            }
18        } 
19        if(ans == 0) return 1;
20        return ans;
21    }
22}