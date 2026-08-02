// Last updated: 8/2/2026, 6:22:22 PM
1class Solution {
2    public String[] uncommonFromSentences(String s1, String s2) {
3        HashMap<String, Integer> map = new HashMap<>();
4        String[] words1 = s1.split(" ");
5        String[] words2 = s2.split(" ");
6    
7        for(int i = 0; i < words1.length; i++){
8            String s = words1[i];
9            map.put(s, map.getOrDefault(s, 0) +1);
10        }
11        for(int i = 0; i < words2.length; i++){
12            String s = words2[i];
13            map.put(s, map.getOrDefault(s, 0) +1);
14        }
15
16        ArrayList<String> arr = new ArrayList<>();
17        for(String word : map.keySet()){
18            if(map.get(word) == 1){
19                arr.add(word);
20            }
21        }
22        String[] ans = arr.toArray(new String[0]);
23        return ans;
24    }
25}