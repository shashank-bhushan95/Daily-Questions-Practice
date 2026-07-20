// Last updated: 7/20/2026, 11:07:54 PM
1class Solution {
2    public int reverseBits(int n) {
3        // int reversed = Integer.reverse(n);
4        // return reversed;
5        ArrayList<Integer> a = new ArrayList<>();
6        for(int i = 0; i < 32; i++){
7            int digit = n % 2;
8            a.add(digit);
9            n = n / 2;
10        }
11        Collections.reverse(a);
12        int ans = 0;
13        int po = 0;
14        for(int num : a){
15            if(num == 1){
16                int x = (int) Math.pow(2, po);
17                ans = ans + x;
18            }
19            po++;
20        }
21        return ans;
22    }
23}