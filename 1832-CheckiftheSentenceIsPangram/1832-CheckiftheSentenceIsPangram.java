// Last updated: 7/1/2026, 10:47:22 AM
1class Solution {
2    public boolean checkIfPangram(String sentence) {
3        boolean[] arr = new boolean[26];
4        for(int i = 0; i < sentence.length(); i++){
5            char ch = sentence.charAt(i);
6            arr[ch - 'a'] = true;
7        }
8
9        for(int i = 0; i < arr.length; i++){
10            if(arr[i] == false) return false;
11        }
12        return true;
13    }
14}