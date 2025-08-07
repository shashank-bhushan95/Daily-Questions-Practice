// Last updated: 8/7/2025, 10:03:47 PM
class Solution {
    public static boolean logic(int n,int pow){
        if(Math.pow(2,pow) > n) return false;
        if(Math.pow(2,pow) == n) return true;
        return logic(n,pow+1);
    }
    public boolean isPowerOfTwo(int n) {
        int pow = 0;
        return logic(n,pow);
    }
}