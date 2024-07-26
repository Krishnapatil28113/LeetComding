'''
Given a string str and an integer k, return true if the string can be changed into a pangram after at most k operations, else return false.

A single operation consists of swapping an existing alphabetic character with any other alphabetic character.

Note - A pangram is a sentence containing every letter in the english alphabet.

Input: str = "a b c d e f g h i j k l m", k = 20
Output: false
Explaanation: Since there are only 25 charaacters only in this case, so no amount of swapping we can have complete alphabets here.

Approach:
The code checks if a given string can be converted into a pangram (a string containing every letter of the English alphabet at least once) by adding at most k characters.

Time complexity: O(n)
Space complexity: O(1)
'''

class Solution:
    def kPangram(self,string, k):
        # code here
        string=string.replace(' ','')
        z=len(string)
        x=len(set(string))
        if 26-x<=z-x and 26-x<=k:
            return True
        else:
            return False