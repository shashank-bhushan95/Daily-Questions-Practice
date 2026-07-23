// Last updated: 7/23/2026, 2:12:53 PM
1class Solution {
2    public int findComplement(int num) {
3        if(num == 0) return 1;
4        boolean even = false;
5        if(num % 2 == 0) even = true;
6        ArrayList<Integer> arr = new ArrayList<>();
7        while(num > 0){
8            int digit = num % 2;
9            arr.add(digit);
10            num = num / 2;
11        }
12        //
13        //Collections.reverse(arr);
14        int ans = 0;
15        int exp = 0;    // Use for power
16        for(int n : arr){
17            if(n == 0){
18                ans = ans + (int) Math.pow(2, exp);
19            }
20            exp++;
21        }
22        return ans;
23    }
24}