/*
# Problem Statement: find the complement of a given number  
---------------------------------------------------------------
# Approach : using bit manipulation
---------------------------------------------------------------
*/

public int findComplement(int num) {
        if (num == 0) return 1;
        int bitLength = Integer.toBinaryString(num).length();
        int mask = (1 << bitLength) - 1;
        return num ^ mask;
    }
