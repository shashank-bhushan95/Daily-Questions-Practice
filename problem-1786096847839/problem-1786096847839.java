// Last updated: 8/7/2026, 3:30:47 PM
1class Solution {
2    public List<String> commonChars(String[] words) {
3        int[] min = new int[26];
4        
5        for(int i = 0; i < words[0].length(); i++){
6            char ch = words[0].charAt(i);
7            min[ch - 'a']++;
8        }
9        for(int i = 1; i < words.length; i++){
10            String curr = words[i];
11            int[] freq = new int[26];
12            for(int j = 0; j < curr.length(); j++){
13                char ch = curr.charAt(j);
14                freq[ch - 'a']++;
15            }
16            for(int k = 0; k < 26; k++){
17                min[k] = Math.min(min[k], freq[k]);
18            }
19        }
20        List<String> ans = new ArrayList<>();
21        for (int i = 0; i < 26; i++) {
22            while (min[i] > 0) {
23                ans.add(String.valueOf((char)(i + 'a')));
24                min[i]--;
25            }
26        }
27        return ans;
28    }
29}