// Last updated: 7/19/2026, 3:19:13 PM
1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        int maxWealth = 0;
4        
5        for (int[] customer : accounts) {
6            int currentWealth = 0;
7            for (int bankBalance : customer) {
8                currentWealth += bankBalance;
9            }
10            // Update maxWealth if the current customer is richer
11            if (currentWealth > maxWealth) {
12                maxWealth = currentWealth;
13            }
14        }
15        
16        return maxWealth;
17    }
18}
19