/*
# Problem Statement: find the sum of the minimums  of all the subarrays of a given array
---------------------------------------------------------------
# Approach :
- calculate the next smaller element and the previous smaller or equal elemet for each element in the given array
- then calculate the left and right index of that smaller element and use math formula to calculate the number of subarray existing
- then multiply the number of the index and the element to get the total and add it to the previous to it.
---------------------------------------------------------------
*/

import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> nse = findNSE(arr, n);
        ArrayList<Integer> psee = findPSEE(arr, n);
        long total = 0;
        int mod = (int)(1e9 + 7);

        for (int i = 0; i < n; i++) {
            long left = i - psee.get(i);
            long right = nse.get(i) - i;
            total = (total + (right * left % mod * arr[i] % mod) % mod) % mod;
        }
        return (int) total;
    }

    public ArrayList<Integer> findNSE(int[] arr, int n) {
        ArrayList<Integer> nse = new ArrayList<>(n);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            nse.add(n);  // Initialize nse with n
        }
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse.set(i, st.isEmpty() ? n : st.peek());
            st.push(i);
        }
        return nse;
    }

    public ArrayList<Integer> findPSEE(int[] arr, int n) {
        ArrayList<Integer> psee = new ArrayList<>(n);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            psee.add(-1);  // Initialize psee with -1
        }
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            psee.set(i, st.isEmpty() ? -1 : st.peek());
            st.push(i);
        }
        return psee;
    }
}
