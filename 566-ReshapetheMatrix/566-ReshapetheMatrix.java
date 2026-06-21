// Last updated: 6/21/2026, 3:43:54 PM
1class Solution {
2    public String reversePrefix(String s, int k) {
3        char[] ch = new char[s.length()];
4        for(int i = 0; i < s.length(); i++){
5            ch[i] = s.charAt(i);
6        }
7        int i = 0; 
8        int j = k-1;
9        while(i < j){
10            char temp = ch[i];
11            ch[i] = ch[j];
12            ch[j] = temp;
13            i++;
14            j--;
15        }
16        return new String(ch);
17    }
18}