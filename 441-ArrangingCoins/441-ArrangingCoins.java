// Last updated: 8/7/2025, 10:03:30 PM
class Solution {
    public int arrangeCoins(int n) {
        int count=1;
        for(int i=1;i<n;i++){
            if(n-i>=i+1){
                count++;
                n=n-i;
            }
        }
        return count;
    }
}