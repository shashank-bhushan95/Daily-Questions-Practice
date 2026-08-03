// Last updated: 8/3/2026, 5:17:19 PM
1class Solution {
2    public String reverseOnlyLetters(String s) {
3        StringBuilder sb = new StringBuilder(s);
4        int i = 0;
5        int j = sb.length()-1;
6        while(i < j){
7            char ci = sb.charAt(i);
8            char cj = sb.charAt(j);
9            if(!Character.isLetter(ci)) i++;
10            else if(!Character.isLetter(cj)) j--;
11            //if((Character.isLetter(ch)) && (Character.isLetter(ch))) 
12            else{
13                char temp = ci;
14                sb.setCharAt(i, cj);
15                sb.setCharAt(j, temp);
16                i++;
17                j--;
18            }
19        }
20        return sb.toString();
21    }
22}