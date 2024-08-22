/*
# Problem Statement: Reach a given target in minimum number of steps 
---------------------------------------------------------------
# Approach :
- run a while loop until the sum exceeds the target
- then run a second for loop if the sum - target is divisible by 2 then return the step-1
- or else continue the same process of adding the step to sum and incrementing the step
---------------------------------------------------------------
*/

class Solution {
    public int reachNumber(int target) {
        int step = 0;
        int sum = 0;
        if (target < 0) target = -target;  
        while(sum < target) {
            sum += step;
            step++;
        }

        while((target-sum) % 2 != 0) {
            sum += step;
            step++;
        }
        return step-1;
    }
}
