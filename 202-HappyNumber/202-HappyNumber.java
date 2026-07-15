// Last updated: 7/15/2026, 9:35:41 AM
1class Solution {
2    public boolean isHappy(int n) {
3        ArrayList<Integer> arr = new ArrayList<>();
4        while(arr.contains(n) == false && n != 1){
5            int squareSum = 0;
6            arr.add(n);
7            while(n > 0){
8                int digit = n % 10;
9                squareSum = squareSum + (digit * digit);
10                n = n / 10;
11            }
12            n = squareSum;
13        }
14        if(n == 1) return true;
15        return false;
16    }
17}