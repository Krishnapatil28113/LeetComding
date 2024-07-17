/*
# Problem Statement: Check if the number is a palindrome or not
---------------------------------------------------------------
# Approach : 
1. convert int to string then check if the string is a palindrome or not 
2. 
---------------------------------------------------------------
*/

public boolean isPalindrome(int x) {
    String str1 = Integer.toString(x);
    if(str1.charAt(0) < '-') {
        return false;
    }
    int num = str1.length();
    for(int i=0;i<num/2;i++) {
        if(str1.charAt(i) != str1.charAt(num-i-1)) {
            return false;
        }
    }
    return true;
}
