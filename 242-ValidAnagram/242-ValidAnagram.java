// Last updated: 6/15/2026, 12:39:37 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length() != t.length()){
4            return false;
5        }
6        
7        char cs[] = s.toCharArray();
8        char ct[] = t.toCharArray();
9        Arrays.sort(cs);
10        Arrays.sort(ct);
11
12        for(int i = 0; i < cs.length; i++){
13            if(cs[i] != ct[i]){
14                return false;
15            }
16        }
17        return true;
18    }
19}
20