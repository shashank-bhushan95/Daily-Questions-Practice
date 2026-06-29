// Last updated: 6/29/2026, 11:48:20 PM
1class Solution {
2    public int flipgame(int[] fronts, int[] backs) {
3        ArrayList<Integer> a = new ArrayList<>();
4        for(int i = 0; i < fronts.length; i++){
5            if(fronts[i] == backs[i]) {
6                a.add(fronts[i]);
7            }
8        }
9
10        int ans = Integer.MAX_VALUE;
11        for(int i = 0; i < fronts.length; i++){
12            if(a.contains(fronts[i]) == false){
13                ans = Math.min(ans, fronts[i]);
14            }
15            if(a.contains(backs[i]) == false){
16                ans = Math.min(ans, backs[i]);
17            }
18        }
19        if(ans == Integer.MAX_VALUE) return 0;
20        return ans;
21    }
22}