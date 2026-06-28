// Last updated: 6/28/2026, 2:19:33 PM
1class Solution {
2    public int compress(char[] chars) {
3        int index = 0;
4        int i = 0;
5        while(i < chars.length){
6            char currentChar = chars[i];
7            int count = 0;
8            while (i < chars.length && chars[i] == currentChar) {
9                count++;
10                i++;
11            }
12            chars[index++] = currentChar;
13
14            // if (count > 1) {
15            //     for (char c : Integer.toString(count).toCharArray()) {
16            //         chars[index++] = c;
17            //     }
18            // }
19            //        Or
20            if (count > 1) {
21                String countStr = String.valueOf(count);
22                for (int j = 0; j < countStr.length(); j++) {
23                    chars[index] = countStr.charAt(j);
24                    index++;
25                }
26            }
27        }
28        return index;
29    }
30}