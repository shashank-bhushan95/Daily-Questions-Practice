// Last updated: 7/27/2026, 4:47:52 PM
1class Solution {
2    public int calPoints(String[] operations) {
3        ArrayList<Integer> arr = new ArrayList<>();
4        for(int i = 0; i < operations.length; i++){
5            String curr = operations[i];
6            if(curr.equals("C") && !arr.isEmpty()){
7                arr.remove(arr.size()-1);
8            }
9            else if(curr.equals("D") && !arr.isEmpty()){
10                int num = (int) arr.get(arr.size()-1);
11                arr.add(num*2);
12            }
13            else if(curr.equals("+") && arr.size() > 1){
14                int num1 = (int) arr.get(arr.size()-1);
15                int num2 = (int) arr.get(arr.size()-2);
16                arr.add(num1+num2);
17            }
18            else{
19                arr.add(Integer.parseInt(curr));
20            }
21        }
22        int ans = 0;
23        for(int num : arr){
24            //num = (int)num;
25            ans += num;
26        }
27        return ans;
28    }
29}