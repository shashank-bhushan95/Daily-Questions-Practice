// Last updated: 6/16/2026, 10:15:49 AM
1class Solution {
2    public int numberOfSteps(int num) {
3        int count = 0;
4        while(num > 0){
5            if(num % 2 == 0){
6                count++;
7                num = num / 2;
8            }
9            else{
10                num = num - 1;
11                count++;
12            }
13        }
14        return count;
15    }
16}