// Last updated: 7/23/2026, 2:13:16 PM
1class Solution {
2    public int findComplement(int num) {
3        ArrayList<Integer> arr = new ArrayList<>();
4        while(num > 0){
5            int digit = num % 2;
6            arr.add(digit);
7            num = num / 2;
8        }
9
10        //Collections.reverse(arr);
11        int ans = 0;
12        int exp = 0;    // Use for power
13        for(int n : arr){
14            if(n == 0){
15                ans = ans + (int) Math.pow(2, exp);
16            }
17            exp++;
18        }
19        return ans;
20    }
21}