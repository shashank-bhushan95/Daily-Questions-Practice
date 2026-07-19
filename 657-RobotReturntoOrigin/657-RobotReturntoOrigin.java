// Last updated: 7/19/2026, 2:51:35 PM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int l = 0;
4        int r = 0;
5        int d = 0;
6        int u = 0;
7        for(int i = 0; i < moves.length(); i++){
8            if(moves.charAt(i) == 'U') u++;
9            if(moves.charAt(i) == 'L') l++;
10            if(moves.charAt(i) == 'R') r++;
11            if(moves.charAt(i) == 'D') d++;
12        }
13        if((l == r) && d == u) return true;
14        return false; 
15    }
16}