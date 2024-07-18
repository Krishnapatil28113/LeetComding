/*
# Problem Statement: Add given 2 binary numbers in the form of string 
---------------------------------------------------------------
# Approach :
start from the back of both the strings then keep track of carry variable
carry on untill either one of the strings if empty or the carry has some value
and simultaneously strore it in the string builder
then reverse the string and return
---------------------------------------------------------------
*/

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while(i>=0 || j>=0 || carry == 1) {
            if (i >= 0) {
                carry += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += b.charAt(j--) - '0';
            }
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
