// Last updated: 7/14/2026, 9:49:29 AM
1class Solution {
2    public int mySqrt(int x) {
3        int start = 0;
4        int end = x;
5        
6
7        while(start <= end){
8            int mid = start + (end - start) / 2;
9            long pro = (long)mid * mid;
10            if(pro == x) return mid;
11            else if(pro > x){
12                end = mid-1;
13            }
14            else{
15                start = mid + 1;
16            }
17        }
18        return end;
19    }
20}