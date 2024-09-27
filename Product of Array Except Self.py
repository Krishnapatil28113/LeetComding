'''
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Approach: Traverse the list once to compute the total product (ignoring zeroes), then construct the result based on whether zeroes are present.

Time Complexity: (O(n)), where (n) is the length of the input list.

Space Complexity: (O(n)), as we use extra space for the result array `ans`.
'''

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """ 
        ans=[]
        zero=False
        prod=1
        if nums.count(0)>=2:
            for i in range(len(nums)):
                ans.append(0)
            return ans
        for i in nums:
            if i!=0:
                prod*=i
            else:
                zero=True
        if zero==True:
            for i in nums:
                if i!=0:
                    ans.append(0)
                else:
                    ans.append(prod)
        else:
            for i in nums:
                ans.append(prod//i)
        return ans
