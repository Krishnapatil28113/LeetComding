/*
# Problem Statement: To delete nodes from linked list based on the 'unique' elements present in array nums
---------------------------------------------------------------
# How to think: 
* When we think of brute force, we can think of traversing the whole linked list scanning for the first element in nums
* And similarly, repeat this process for all the elements of the array
* But, this is not optimal

* So, in order to avoid checking for all the elements, we can do the reverse
* While traversing the linked list, we can check whether the element exist in the array or not
* But, to search in an array, it will take O(n) time, which is same as that of the brute force approach
* So, we will have to store the elements of the array in some data structure which allows us to insert and search in O(1) time
* And, we know that the elements in nums are unique
* Therefore, we will think of storing the elements in an unordered_set
---------------------------------------------------------------
*/

#include<bits/stdc++.h>
using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:
    ListNode* modifiedList(vector<int>& nums, ListNode* head) {
        int n = nums.size();
        unordered_set<int> st;
        for(int i=0;i<n;i++) {
            st.insert(nums[i]);
        }

        ListNode* prev = nullptr;
        ListNode* curr = head;

        while(curr != nullptr) {
            if(st.find(curr->val) != st.end()) {
                if(curr == head) {
                    head = head->next;
                    curr = head;
                }
                else {
                    prev->next = curr->next;
                    curr = curr->next;
                }
            }
            else {
                prev = curr;
                curr = curr->next;
            }
        }

        return head;
    }
};