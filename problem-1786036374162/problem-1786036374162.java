// Last updated: 8/6/2026, 10:42:54 PM
1class Solution {
2    public List<Integer> addToArrayForm(int[] num, int k) {
3        int carry = 0;
4        List<Integer> ans = new ArrayList<>();
5        int i = num.length-1;
6        while(i >= 0 || k > 0 || carry > 0){
7            int digit = k % 10;
8            int n = (i >= 0) ? num[i] : 0;
9            int sum = carry + n + digit;
10            ans.add(sum % 10);
11            carry = sum / 10;
12            k = k / 10;
13            i--;
14        }
15        if(carry > 0){
16            ans.add(1);
17        }
18        Collections.reverse(ans);
19        return ans;
20    }
21}