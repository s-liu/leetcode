public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int remaining = 0;
        int sum = 0;
        for (int i = 0; i < gas.length; i ++) {
            remaining += (gas[i] - cost[i]);
            sum += (gas[i] - cost[i]);
            if ( sum < 0) {
                start = i + 1;
                sum = 0;
            }
        }   
        if ( remaining < 0 ) {
            return -1;
        } else {
            return start;
        }
    }
}
