// Last updated: 7/19/2026, 3:40:13 PM
1class Solution {
2    public int value(char ch){
3        if(ch == 'I') return 1;
4        if(ch == 'V') return 5;
5        if(ch == 'X') return 10;
6        if(ch == 'L') return 50;
7        if(ch == 'C') return 100;
8        if(ch == 'D') return 500;
9        if(ch == 'M') return 1000;
10        return 0;
11    }
12    public int romanToInt(String s) {
13        int total = 0;
14        for(int i = 0; i < s.length(); i++){
15            char ch = s.charAt(i);
16            int val = value(ch);
17            if(i+1 < s.length() && val < value(s.charAt(i+1))){
18                total -= val;
19            }
20            else total += val;
21        }
22        return total;
23    }
24}