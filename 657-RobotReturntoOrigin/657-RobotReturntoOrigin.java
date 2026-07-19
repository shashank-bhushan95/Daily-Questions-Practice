// Last updated: 7/20/2026, 12:27:28 AM
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        //ArrayList<ArrayList>Integer>> ans = new ArrayList<>();
4        List<List<Integer>> ans = new ArrayList<>();
5        for(int i = 0; i < numRows; i++){
6            List<Integer> currentRow = new ArrayList<>();
7            for(int j = 0; j < i+1; j++){
8                if(j == 0 || j == i) currentRow.add(1);
9                else{
10                    int val1 = ans.get(i - 1).get(j);
11                    int val2 = ans.get(i - 1).get(j - 1);
12                    currentRow.add(val1 + val2);
13                }
14            }
15            ans.add(currentRow);
16        }
17        return ans;
18    }
19}