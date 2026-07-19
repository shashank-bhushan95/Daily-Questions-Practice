// Last updated: 7/20/2026, 1:39:02 AM
1class Solution {
2    public int hammingWeight(int n) {
3        //int decimal = Integer.parseInt(n, 2);
4        return Integer.bitCount(n);
5    }
6}