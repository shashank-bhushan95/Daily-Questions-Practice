// Last updated: 7/27/2026, 2:11:23 PM
1class Solution {
2    public int distributeCandies(int[] candyType) {
3        HashSet<Integer> arr = new HashSet<>();
4        for(int num : candyType){
5            arr.add(num);
6        }
7        return Math.min(arr.size(), candyType.length / 2);
8    }
9}