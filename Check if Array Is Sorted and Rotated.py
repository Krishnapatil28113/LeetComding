'''
Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Example :

Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].

Approach: To check if any rotation of the original array matches the sorted version of the array.

Time Complexity: O(n^2) (due to checking all possible rotations).
Space Complexity: O(n) (to store the copy of the array).
'''

class Solution:
    def check(self, nums: List[int]) -> bool:
        nos=[]
        for i in range(len(nums)):
            nos.append(nums[i])
        nums.sort()
        tf=False
        for i in range(len(nums)):
            if nos[i:]+nos[:i]==nums:
                tf=True
        if tf==True:
            return True
        return False