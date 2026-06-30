// Last updated: 6/30/2026, 11:23:55 PM
1class Solution {
2    public boolean isVowel(char c){
3        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') return true;
4        else return false;
5    }
6    public String reverseVowels(String s) {
7        int start = 0;
8        int end = s.length()-1;
9        StringBuilder sb = new StringBuilder();
10        for(int i = 0; i < s.length(); i++) sb.append(s.charAt(i));
11
12        while(start < end){
13            char sChar = s.charAt(start);
14            char eChar = s.charAt(end);
15            if(isVowel(sChar) && isVowel(eChar)){
16                sb.setCharAt(start, eChar);
17                sb.setCharAt(end, sChar);
18                start++;
19                end--;
20            }
21            else if(!isVowel(sChar)) start++;
22            else if(!isVowel(eChar)) end--;
23        }
24        String str = sb.toString(); 
25        return str;
26    }
27}