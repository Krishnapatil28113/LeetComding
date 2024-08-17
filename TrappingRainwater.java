/*
# Problem Statement: Trapping Rainwater 
- Given the heights of the buildings calculate the amount (units) of water trapped in between.
---------------------------------------------------------------
# Approach : (two pointer approach)
first we keep track of two variables left max and right max (lmax = 0, rmax = n-1)
move the variable whose values is smaller and then apply the formula functions which we have gotten from the calculation
update the value of total and the max values at each step as necessary

YT Video - https://youtu.be/1_5VuquLbXg?si=AGTBQbQT2TjhresQ
---------------------------------------------------------------
*/

class Solution {
    public int trap(int[] height) {
        int lmax = 0;
        int rmax = 0;
        int total = 0;
        int n = height.length;
        int l = 0 ;
        int r = n-1;
        while(l < r) {
            if(height[l] <= height[r]) {
                if(lmax > height[l]) {
                    total += lmax - height[l];
                } else {
                    lmax = height[l];
                }
                l++;
            } else {
                if(rmax > height[r]) {
                    total += rmax - height[r];
                } else {
                    rmax = height[r];
                }
                r--;
            }
        }
        return total;
    }
}
