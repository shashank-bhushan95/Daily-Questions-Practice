// Last updated: 4/2/2026, 7:00:26 PM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3    //     int i = m-1;
4    //     int j = n-1;
5    //     int index = nums1.length-1;
6
7    //     while(i >= 0 && j >= 0){
8    //         if(nums1[i] > nums2[j]){
9    //             nums1[index] = nums1[i];
10    //             i--;
11    //             index--;
12    //         }
13    //         else{
14    //             nums1[index] = nums2[j];
15    //             j--;
16    //             index--;
17    //         }
18    //     }
19
20    //     while(i >= 0){
21    //         nums1[index] = nums1[i];
22    //         i--;
23    //         index--;
24    //     }
25
26    //     while(j >= 0){
27    //         nums1[index] = nums2[j];
28    //         j--;
29    //         index--;
30    //     }
31
32
33
34    int i = 0;
35    int j = 0;
36    int index = 0;
37    int[] ans = new int[nums1.length];
38
39    while(i < m && j < n){
40        if(nums1[i] > nums2[j]){
41            ans[index] = nums2[j];
42            j++;
43            index++;
44        }
45        else{
46            ans[index] = nums1[i];
47            index++;
48            i++;
49        }
50    }
51
52    while(i < m){
53        ans[index] = nums1[i];
54        i++;
55        index++;
56    }
57
58    while(j < n){
59        ans[index] = nums2[j];
60        j++;
61        index++;
62    }
63
64    for(int k = 0; k < m + n; k++){
65        nums1[k] = ans[k];
66        }
67    }
68}