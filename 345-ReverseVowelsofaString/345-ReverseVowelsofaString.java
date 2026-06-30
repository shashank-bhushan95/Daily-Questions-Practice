// Last updated: 6/30/2026, 11:29:40 PM
1class Solution {
2    public boolean isVowel(char c){
3        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') return true;
4        else return false;
5    }
6    public String reverseVowels(String s) {
7        char[] arr = s.toCharArray();
8        int i = 0;
9        int j = arr.length - 1;
10
11        while (i < j) {
12            while (i < j && !isVowel(arr[i])) i++;
13            while (i < j && !isVowel(arr[j])) j--;
14
15            char temp = arr[i];
16            arr[i] = arr[j];
17            arr[j] = temp;
18
19            i++;
20            j--;
21        }
22
23        return new String(arr);
24    }
25}