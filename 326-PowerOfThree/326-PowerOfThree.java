// Last updated: 8/7/2025, 10:03:39 PM
class Solution {
    public static boolean solve(int n, int pow){
        if(Math.pow(3,pow) > n) return false;
        if(Math.pow(3,pow) == n) return true;
        return solve(n,pow+1);
    }
    public boolean isPowerOfThree(int n) {
        int pow = 0;
        return solve(n,pow);
    }
}