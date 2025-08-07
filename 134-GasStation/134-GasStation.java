// Last updated: 8/7/2025, 10:03:59 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int pos = -1;
        int total = 0;
        int curr = 0;
        for(int i = 0; i < gas.length; i++){
            int diff = gas[i] - cost[i];
            curr = curr + diff;
            total = total + diff;

            if(curr < 0){
                curr = 0;
                pos = i;
            }
        }
        if(total >= 0){
            return pos+1;

        }
        return -1;
    }
}