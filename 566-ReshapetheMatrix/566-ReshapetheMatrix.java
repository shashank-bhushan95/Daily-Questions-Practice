// Last updated: 6/21/2026, 3:19:45 PM
1class Solution {
2    public String reversePrefix(String s, int k) {
3        // Step 1: Shuruat ke k characters ka substring nikal kar use reverse karo
4        StringBuilder prefix = new StringBuilder(s.substring(0, k));
5        prefix.reverse(); // Yeh built-in function characters ko ulta kar dega
6        
7        // Step 2: Bache hue part ko append karo aur string return kar do
8        return prefix.append(s.substring(k)).toString();
9    }
10}