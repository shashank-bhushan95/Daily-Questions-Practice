// Last updated: 6/29/2026, 11:22:43 PM
1class Solution {
2    public int largestInteger(int num) {
3        ArrayList<Integer> even = new ArrayList<>();
4        ArrayList<Integer> odd = new ArrayList<>();
5        ArrayList<Integer> dig = new ArrayList<>();
6        while(num > 0){
7            int digit = num % 10;
8            if(digit % 2 == 0) even.add(digit);
9            else odd.add(digit);
10            dig.add(digit);
11            num = num / 10;
12        }
13
14        Collections.sort(even);
15        Collections.sort(odd);
16        Collections.reverse(dig);
17
18        int evenIdx = even.size() - 1;
19        int oddIdx = odd.size() - 1;
20        for (int i = 0; i < dig.size(); i++) {
21            int originalDigit = dig.get(i);
22            if (originalDigit % 2 == 0) {
23                dig.set(i, even.get(evenIdx)); 
24                evenIdx--;
25            } else {
26                dig.set(i, odd.get(oddIdx));
27                oddIdx--;
28            }
29        }
30
31        int result = 0;
32        for (int n : dig) {
33            result = (result * 10) + n;
34        }
35
36        return result;
37    }
38}