// Last updated: 7/27/2026, 1:59:39 PM
1class Solution {
2    public int distributeCandies(int[] candyType) {
3        HashSet<Integer> arr = new HashSet<>();
4        for(int num : candyType){
5            arr.add(num);
6        }
7        int size = arr.size();
8        int half = candyType.length/2;
9        if(half > size) return size;
10        else return half;
11    }
12}