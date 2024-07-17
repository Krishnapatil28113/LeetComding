'''
Given a string s without spaces, a character ch and an integer count. Your task is to return the substring that remains after the character ch has appeared count number of times.
Note:  Assume upper case and lower case alphabets are different. “”(Empty string) should be returned if it is not possible, or the remaining substring is empty.

Input: s = "Thisisdemostring", ch = 'i', count = 3
Output: ng

Approach:
The code finds the last occurrence of character `ch` in string `s`, then returns the substring following this occurrence if it's not at the string's end, otherwise returns an empty string.

Time Complexity: O(n), where n is the length of the string s.
Space Complexity: O(n), primarily due to the space used by the ans string to store the resulting substring.
'''

class Solution:
    def printString(self, s, ch, count):
	c=0
	ans=''
	index=0
	if ch not in s:
	    return ''
        for i in range(len(s)):
            if s[i]==ch and c<count:
                c+=1
                index=i
        if c<count:
            return ''
        if index==len(s)-1:
            return ''
        else:
            for i in range(index+1,len(s)):
                ans+=s[i]
            return ans