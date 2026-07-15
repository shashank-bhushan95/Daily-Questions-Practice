// Last updated: 7/15/2026, 12:49:53 PM
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        long start = 0;
4        long end = num;
5        
6        while(start <= end){
7            long mid = (start + end) / 2;
8            long pro = mid * mid;
9            if(pro == num) return true;
10            else if(pro > num){
11                end = mid-1;
12            }
13            else{
14                start = mid+1;
15            }
16        }
17        return false;
18    }
19}