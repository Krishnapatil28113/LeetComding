'''
Link: https://codeforces.com/problemset/problem/1971/C
Description:
There is a clock labeled with the numbers 1 through 12 in clockwise order, as shown below.
(First test case is shown).

                12
        11               1
     
  10 [c]                       2 (a)

9 (b)                             3

  8                           4

        7                5
                6 [d]

Alice and Bob have four *distinct* integers "a", "b", "c", "d" not more than 12. 
Alice ties a red string connecting "a" and "b", and Bob ties a blue string connecting "c" and "d".

Do the strings intersect? (The strings are straight line segments.)

Sample Input: (first line has number of test cases, after that each line has a,b,c,d)
3
2 9 10 6
3 8 9 1
1 2 3 4

Sample Output:
YES
NO
NO

'''

t = int(input()) # first line has number of test cases
 
for _ in range(t):
    a, b, c, d = [int(x) for x in input().split()] # assign int values of a,b,c,d using list comprehension
    '''
    Here we swap end-points of the line-segments such that:
    1. a,b and c,d are in ascending order (for convenience)
    2. a and c are in ascending order (b and d may or may not be in ascending order)

    This makes it easier to think and compare. We don't need to work out any circle-based logic,
    like using remainders and stuff after crossing 12 on the clock.
    '''
    if a > b:
        a, b = b, a
    if c > d:
        c, d = d, c
    if a > c:
        a, b, c, d = c, d, a, b

    '''
    Since "a" and "c" are arranged such that "a" comes before "c", we just need to check if "b" and "d" follow the opposite order.
    If "b" and "d" are in descending order, it means that the string "cd" ends before the string from "a" reaches "b",
    because "b" is greater than "d".
    
    If b and d are in ascending order, the strings will cross each other while connecting.
    From "a", the first string will have to go to some point "b" less than "d". 
    And from "c", which is greater than "a", the second string will have to go to the point "d", which 
    will be above "b", causing the strings to intersect.

    However, we also need to compare if "b" is less than "c". If so, the segments ab and cd will never intersect,
    because the first string will end at a point "b" less than "c", before the second string even begins. And since
    "d" is greater than "c", there is no way for the second string to turn back and interesect the first string.
    '''
    if b < c:
        print("NO")
    else:
        if b < d:
            print("YES")
        else:
            print("NO")
