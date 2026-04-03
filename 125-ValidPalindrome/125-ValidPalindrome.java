// Last updated: 4/3/2026, 2:18:53 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        int i = 0; int j = s.length()-1;
4        while(i <= j){
5            char start = s.charAt(i);
6            char end = s.charAt(j);
7            if(!Character.isLetterOrDigit(start)){
8                i++;
9                continue;
10            }
11            if(!Character.isLetterOrDigit(end)){
12                j--;
13                continue;
14            }
15            if(Character.toLowerCase(start) != Character.toLowerCase(end)){
16                return false;
17            }
18            i++;
19            j--;
20        }
21        return true;
22    }
23}