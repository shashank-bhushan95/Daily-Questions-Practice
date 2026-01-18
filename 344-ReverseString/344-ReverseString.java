// Last updated: 1/18/2026, 3:23:17 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        int i = 0;
4        int j = s.length()-1;
5
6        while(i < j){
7            if(!Character.isLetterOrDigit(s.charAt(i))){
8                i = i+1;
9                continue;
10            }
11            if(!Character.isLetterOrDigit(s.charAt(j))){
12                j = j-1;
13                continue;
14            }
15            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
16                return false;
17            }
18            i = i+1;
19            j = j-1;
20        }
21        return true;
22    }
23}