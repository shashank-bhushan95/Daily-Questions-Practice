// Last updated: 8/5/2026, 10:10:39 AM
1class Solution {
2    public int minDeletionSize(String[] strs) {
3        int ans = 0;
4        for(int i = 0; i < strs[0].length(); i++){
5            char pre = strs[0].charAt(i);
6            for(int j = 0; j < strs.length; j++){
7                char curr = strs[j].charAt(i);
8                if(pre > curr){
9                    ans++;
10                    break;
11                }
12                pre = curr;
13            }
14        }
15        return ans;
16    }
17}