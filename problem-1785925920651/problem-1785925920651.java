// Last updated: 8/5/2026, 4:02:00 PM
1class Solution {
2    public boolean isAlienSorted(String[] words, String order) {
3        int[] arr = new int[26];
4        for(int i = 0; i < order.length(); i++){
5            arr[order.charAt(i)-'a'] = i;
6        }
7
8        //String pre = words[0];
9        for(int i = 1; i < words.length; i++){
10            String pre = words[i-1];
11            String curr = words[i];
12            int j = 0;
13            for(j = 0; j < Math.min(pre.length(), curr.length()); j++){
14                char preChar = pre.charAt(j);
15                char currChar = curr.charAt(j);
16                int preIndex = arr[preChar - 'a'];
17                int currIndex = arr[currChar - 'a'];
18                if (preIndex < currIndex) break;
19                if(preIndex > currIndex) return false;
20            }
21            if (j == Math.min(pre.length(), curr.length())
22                    && pre.length() > curr.length()) {
23                return false;
24            }
25        }
26        //if (pre.length() > curr.length()) return false;
27        return true;
28    }
29}