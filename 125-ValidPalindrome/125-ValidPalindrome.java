// Last updated: 4/3/2026, 2:15:27 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        int i = 0; int j = s.length()-1;
4        while(i <= j){
5            if(!Character.isLetterOrDigit(s.charAt(i))){
6                i++;
7                continue;
8            }
9            if(!Character.isLetterOrDigit(s.charAt(j))){
10                j--;
11                continue;
12            }
13            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
14                return false;
15            }
16            i++;
17            j--;
18        }
19        return true;
20    }
21}