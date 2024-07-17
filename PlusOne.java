/*
# Problem Statement: Given a number in the form of integer array , return and array by adding one in the number
---------------------------------------------------------------
# Approach :
- int the for loop check if the last digit is 9 if no add one if yes make it zero and carry one to the next digit
---------------------------------------------------------------
*/

public int[] plusOne(int[] digits) {
      for (int i = digits.length - 1; i >= 0; i--) {
          if (digits[i] < 9) {
              digits[i]++;
              return digits;
          }
          digits[i] = 0;
      }
      digits = new int[digits.length + 1];
      digits[0] = 1;
      return digits;
  }
