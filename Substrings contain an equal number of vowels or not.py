'''
Problem statement
You are given a string ‘str’ of even length. Your task is to find out if we divide the ‘str’ from the middle, will both the substrings contain an equal number of vowels or not.

For Example:
You are given, ‘str’= ‘codingninjas’, when we split this string we get, ‘coding’ and ‘ninjas’ which both contain 2 vowels each. Hence the answer is ‘True’.

Approach:
The function splits the string into two halves based on its length, counts the vowels in each half, and returns True if both halves contain an equal number of vowels; otherwise, it returns False.
Time Complexity: O(n) (where n is the length of the string)
Space Complexity: O(1)
'''

from os import *
from sys import *
from collections import *
from math import *


def splitString(string: str) -> bool:
    # Write your code here.
    if len(string)==2:
        s1=string[0]
        s2=string[1]
    else:
        x=len(string)//2
        s1=string[:x]
        s2=string[x:]
    vowels=['a','e','i','o','u','A','E','I','O','U']
    vowels_in_s1,vowels_in_s2=0,0

    for i in s1:
        if i in vowels:
            vowels_in_s1+=1
    for i in s2:
        if i in vowels:
            vowels_in_s2+=1
    
    if vowels_in_s1==vowels_in_s2:
        return True
    else:
        return False
