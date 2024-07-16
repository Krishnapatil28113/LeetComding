#User function Template for python3
'''
Question:
Given a sorted (in ascending order) and rotated array arr of distinct elements which may be rotated at some point and given an element key, the task is to find the index of the given element key in the array arr. The whole array arr is given as the range to search.
Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 10
Output: 5
Explanation: 10 is found at index 5.

Brute Force Approach:
To iterate through the whole array and find where the key is present.

Time Complexity: O(n)
Space Complexity: O(1)
'''
class Solution:
    def search(self,arr,key):
        # Complete this function
        for i in range(len(arr)):
            if arr[i]==key:
                return i
        return -1

'''
Expected Approach:
class Solution:
    # Function to search for a key in a rotated sorted array.
    def search(self, arr, key):
        n = len(arr)
        start, end = 0, n - 1
        while start <= end:
            mid = (start + end) // 2

            # If middle element is the key
            if arr[mid] == key:
                return mid

            # If the left part is sorted
            if arr[start] <= arr[mid]:
                if arr[start] <= key <= arr[mid]:
                    # key is in the left part
                    end = mid - 1
                else:
                    # key is in the right part
                    start = mid + 1
            else:  # If the right part is sorted
                if arr[mid] <= key <= arr[end]:
                    # key is in the right part
                    start = mid + 1
                else:
                    # key is in the left part
                    end = mid - 1
        return -1
        
Time Complexity: O(logn)
Space Complexity: O(1)
'''
#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())

    for _ in range(t):
        A = list(map(int, input().strip().split()))
        k = int(input())
        ob = Solution()
        print(ob.search(A, k))

# } Driver Code Ends