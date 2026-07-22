// Last updated: 7/23/2026, 2:07:47 AM
1class Solution {
2    public int longestPalindrome(String s) {
3    
4        int[] arr = new int[128];
5        for(int i = 0; i < s.length(); i++){
6            char ch = s.charAt(i);
7            int index = (int)(ch);
8            arr[index]++;
9        }
10
11        boolean odd = false;
12        int ans = 0;
13        for(int num : arr){
14            if(num % 2 == 0) ans += num;
15            else if(num % 2 != 0){
16                ans += num-1;
17                odd = true;
18            }
19        }
20
21        if(odd){
22            ans++;
23        }
24
25        return ans;
26    }
27}