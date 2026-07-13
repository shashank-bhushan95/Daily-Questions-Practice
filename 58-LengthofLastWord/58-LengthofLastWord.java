// Last updated: 7/13/2026, 12:42:27 PM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        String str = s.trim();
4        String[] arr = str.split(" ");
5        String word = arr[arr.length-1];
6        int count = 0;
7        for(int i = 0; i < word.length(); i++) count++;
8        return count;
9    }
10}