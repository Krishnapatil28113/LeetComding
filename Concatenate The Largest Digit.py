'''
Problem statement
You are given three non-zero numbers ‘A’, ‘B’, and ‘C’. The task is to find the number formed by concatenating the largest digit from each of these numbers in the order of ‘A’, ‘B’, and ‘C’.

Example :
A = 5678, B = 45 and C = 769
The largest digit in ‘A’ is ‘8’, ‘B’ is ‘5’, and ‘C’ is ‘9’. The new number formed by concatenating the largest digit from each of these numbers is ‘859’. So, the answer is ‘859’.

The code identifies the largest digit in each of three input numbers, concatenates these digits, and returns the resulting value, with a time complexity of O(n_1 + n_2 + n_3) and a space complexity of O(1).
'''

from os import *
from sys import *
from collections import *
from math import *

def bigno(x):
    x=str(x)
    num=x[0]
    for i in x:
        if i>num:
            num=i
    return num
def concatLargestDigit(a, b, c):

    # Write your code here
    A=bigno(a)
    B=bigno(b)
    C=bigno(c)

    ans=A+B+C
    return int(ans)