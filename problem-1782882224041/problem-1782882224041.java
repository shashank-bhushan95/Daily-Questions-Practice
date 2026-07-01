// Last updated: 7/1/2026, 10:33:44 AM
1class Solution {
2    public int minimumLength(String s) {
3        int i = 0; 
4        int j = s.length()-1;
5
6        while(i < j){
7            if(s.charAt(i) == s.charAt(j)){
8                while(i < j && s.charAt(i) == s.charAt(i+1)){
9                    i++;
10                }
11                while(i < j && s.charAt(j) == s.charAt(j-1)){
12                    j--;
13                }
14                i++;
15                j--;
16            }
17            else{
18                return j-i+1;
19            }
20        }
21        return Math.max(0, j - i + 1);
22    }
23}