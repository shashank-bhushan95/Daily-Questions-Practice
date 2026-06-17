// Last updated: 6/17/2026, 12:24:01 PM
1class Solution {
2    public int[] findEvenNumbers(int[] digits) {
3        HashSet<Integer> a = new HashSet<>();
4
5        for(int i = 0; i < digits.length; i++){
6            if(digits[i] == 0) continue;
7            for(int j = 0; j < digits.length; j++){
8                for(int k = 0; k < digits.length; k++){
9                    if(i != j && i != k && j != k){
10                        int num = digits[i]*100 + digits[j]*10 + digits[k];
11                        if(num % 2 == 0){
12                            a.add(num);
13                        }
14                    }
15                }
16            }
17        }
18        int size = a.size();
19        int[] ans = new int[size];
20        int index = 0;
21        for(int i : a){
22            ans[index++] = i;
23        }
24        Arrays.sort(ans);
25        return ans;
26    }
27}