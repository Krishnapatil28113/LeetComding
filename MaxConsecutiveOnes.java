/*
# Problem Statement: Count max number of consecutive ones in an array
---------------------------------------------------------------
# Approach :
- run a for loop for cheking ones 
- then apply if-else condition to check if its 1/0 and then update max accordingly.
---------------------------------------------------------------
*/

public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 1) {
                count++;
                if(max < count) {
                    max = count;
                }
            } else {
                if(max < count) {
                    max = count;
                }
                count = 0;
            }
        }
        return max;
    }
