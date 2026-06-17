// Last updated: 6/17/2026, 12:58:08 PM
1class Solution {
2    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
3        ArrayList<Boolean> ans = new ArrayList<>();
4        int max = 0;
5        for(int i = 0; i < candies.length; i++){
6            if(max < candies[i]) max = candies[i];
7        }
8        for(int i  = 0; i < candies.length; i++){
9            if((candies[i] + extraCandies) >= max){
10                ans.add(true);
11            }
12            else{
13                ans.add(false);
14            }
15        }
16        return ans;
17    }
18}