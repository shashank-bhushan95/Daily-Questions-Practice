// Last updated: 6/30/2026, 12:27:22 AM
1class Solution {
2    public int[][] flipAndInvertImage(int[][] image) {
3        for(int i = 0; i < image.length; i++){
4            int start = 0;
5            int end = image[0].length -1;
6            while(start < end){
7                int temp = image[i][start];
8                image[i][start] = image[i][end];
9                image[i][end] = temp;
10                start++;
11                end--;
12            }
13        }
14        for(int i = 0; i < image.length; i++){
15            for(int j = 0; j < image[0].length; j++){
16                if(image[i][j] == 1) image[i][j] = 0;
17                else image[i][j] = 1;
18            }
19        }
20
21        return image;
22    }
23}