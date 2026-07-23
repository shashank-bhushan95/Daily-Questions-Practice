// Last updated: 7/23/2026, 1:52:21 PM
1class Solution {
2    public int hammingDistance(int x, int y) {
3        ArrayList<Integer> arrX = new ArrayList<>();
4        ArrayList<Integer> arrY = new ArrayList<>();
5        if(x == 0) arrX.add(0);
6        if(y == 0) arrY.add(0);
7
8        while(x > 0){
9            int digit = x % 2;
10            arrX.add(digit);
11            x = x / 2;
12        }
13
14        while(y > 0){
15            int digit = y % 2;
16            arrY.add(digit);
17            y = y / 2;
18        }
19
20        if(arrX.size() > arrY.size()){
21            while(arrX.size() != arrY.size()){
22                arrY.add(0);
23            }
24        }
25        else{
26            while(arrX.size() != arrY.size()){
27                arrX.add(0);
28            }
29        }
30
31        int count = 0;
32        for (int i = 0; i < arrX.size(); i++) {
33            if (!arrX.get(i).equals(arrY.get(i))) {
34                count++;
35            }
36        }
37        return count;
38    }
39}