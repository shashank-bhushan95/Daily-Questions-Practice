// Last updated: 7/11/2026, 2:19:00 PM
1class Solution {
2    public String firstPalindrome(String[] words) {
3        String ans = "";
4        for(int i = 0; i < words.length; i++){
5            int start = 0;
6            int end = words[i].length()-1;
7            boolean flag = true;
8            while(start < end){
9                if(words[i].charAt(start) != words[i].charAt(end)){
10                    flag = false;
11                    break;
12                }
13                else{
14                    start++;
15                    end--;
16                }
17            }
18            if(flag){
19                ans = words[i];
20                return ans;
21            }
22        }
23        return ans;
24    }
25}