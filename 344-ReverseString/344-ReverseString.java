// Last updated: 1/18/2026, 3:39:16 PM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        // int ans[] = new int[m+n];
4        // int i = 0;
5        // int j = 0;
6        // int index = 0;
7        // while(index <= Math.min(m,n)-1){
8        //     if(nums1[i] > nums2[j]){
9        //         ans[index] = nums2[j];
10        //         j++;
11        //         index++;
12        //     }
13        //     else{
14        //         ans[index] = nums1[i];
15        //         i++;
16        //         index++;
17        //     }
18        // }
19        // System.out.print(ans);
20
21        int i = m-1;
22        int j = n-1;
23        int k = m+n-1;
24        while(i >= 0 && j >= 0){
25            if(nums1[i] > nums2[j]){
26                nums1[k] = nums1[i];
27                i = i-1;
28            }
29            else{
30                nums1[k] = nums2[j];
31                j = j-1;
32            }
33            k = k-1;
34        }
35
36        while(i >= 0){
37            nums1[k] = nums1[i];
38            i = i-1;
39            k = k-1;
40        }
41
42        while(j >= 0){
43            nums1[k] = nums2[j];
44            j = j-1;
45            k = k-1;
46        }
47    }
48}