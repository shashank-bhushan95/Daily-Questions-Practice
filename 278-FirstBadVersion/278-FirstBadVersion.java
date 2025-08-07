// Last updated: 8/7/2025, 10:03:42 PM
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int stindex = 1;
        int endindex = n;
        int ans = 0;
        while(stindex <= endindex){
            int mid = stindex + (endindex - stindex) / 2;
            if(isBadVersion(mid)){
                ans = mid;
                endindex = mid - 1;
            }
            else{
                stindex = mid + 1;
            }
        }
        return ans;
    }
}