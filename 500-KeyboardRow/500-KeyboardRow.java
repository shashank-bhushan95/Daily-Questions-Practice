// Last updated: 7/25/2026, 10:39:47 PM
1class Solution {
2    public String[] findWords(String[] words) {
3        String row1 = "qwertyuiopQWERTYUIOP";
4        String row2 = "asdfghjklASDFGHJKL";
5        String row3 = "zxcvbnmZXCVBNM";
6        ArrayList<String> list = new ArrayList<>();
7        for(int i = 0; i < words.length; i++){
8            String word = words[i];
9            int row = 0;
10            char first = word.charAt(0);
11            if(row1.indexOf(first) != -1) row = 1;
12            else if(row2.indexOf(first) != -1) row = 2;
13            else row = 3;
14            boolean valid = true;
15
16            for(int j = 0; j < word.length(); j++){
17                char ch = word.charAt(j);
18                if (row == 1 && row1.indexOf(ch) == -1) {
19                    valid = false;
20                    break;
21                }
22                if (row == 2 && row2.indexOf(ch) == -1) {
23                    valid = false;
24                    break;
25                }
26                if (row == 3 && row3.indexOf(ch) == -1) {
27                    valid = false;
28                    break;
29                }
30            }
31            if(valid) list.add(word);
32        }
33        String[] ans = new String[list.size()];
34        int index = 0;
35        for(String i : list) ans[index++] = i;
36        return ans;
37    }
38}