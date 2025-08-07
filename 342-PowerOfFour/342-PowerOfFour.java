// Last updated: 8/7/2025, 10:03:35 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        int pow = 0;
        return solve(n,pow);
    }
    public static boolean solve(int n, int pow){
         if(Math.pow(4,pow) > n) return false;
         if(Math.pow(4,pow) == n) return true;
         return solve(n,pow+1);
    }
}