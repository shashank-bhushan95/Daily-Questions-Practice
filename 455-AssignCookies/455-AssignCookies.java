// Last updated: 6/28/2026, 1:37:20 AM
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3
4public class Solution extends VersionControl {
5    public int firstBadVersion(int n) {
6        int st = 1;
7        int end = n;
8        int ans = 0;
9        while(st <= end){
10            int mid = st + (end - st) / 2;
11            if(isBadVersion(mid)){
12                ans = mid;
13                end = mid - 1;
14            }
15            else{
16                st = mid + 1;
17            }
18        }
19        return ans;
20    }
21}