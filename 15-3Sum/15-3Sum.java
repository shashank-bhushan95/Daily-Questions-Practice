// Last updated: 7/27/2026, 2:10:06 PM
1class Solution {
2    public int distributeCandies(int[] candyType) {
3        Arrays.sort(candyType);
4        int unique = 1;
5        for(int i = 0; i < candyType.length-1; i++){
6            if(candyType[i] != candyType[i+1]) unique++;
7        }
8        return Math.min(unique, candyType.length/2);
9    }
10}