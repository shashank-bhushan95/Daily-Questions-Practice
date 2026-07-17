// Last updated: 7/17/2026, 3:47:32 PM
1class Solution {
2    public boolean canPlaceFlowers(int[] flowerbed, int n) {
3        int size = flowerbed.length;
4        if (size == 1) {
5            if (flowerbed[0] == 0) n--;
6            return n <= 0;
7        }
8        for(int i = 0; i < size; i++){
9            if(i == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0){
10                n--;
11                flowerbed[i] = 1;
12            }
13            else if(i == size-1 && flowerbed[i] == 0 && flowerbed[i-1] == 0){
14                n--;
15                flowerbed[i] = 1;
16            }
17            else if(i > 0 && i < size-1 && flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0){
18                n--;
19                flowerbed[i] = 1;
20            }
21            
22        }
23        if(n > 0) return false;
24        return true;
25    }
26}