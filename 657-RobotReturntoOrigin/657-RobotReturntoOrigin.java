// Last updated: 7/19/2026, 2:55:28 PM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int l = 0;
4        int u = 0;
5        for(int i = 0; i < moves.length(); i++){
6            if(moves.charAt(i) == 'U') u++;
7            else if(moves.charAt(i) == 'D') u--;
8            else if(moves.charAt(i) == 'L') l++;
9            else l--;
10        }
11        if((l == 0) && u == 0) return true;
12        return false; 
13    }
14}