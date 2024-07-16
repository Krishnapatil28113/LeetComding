/*
# Problem Statement: To find the minimum number of operations required to get back to original folder(main folder)
---------------------------------------------------------------
# How to think:
* In cases, where entities vary, like, "something/"; we can't keep track of it
* So, in these cases, we will think of focussing on things we can focus on
* Here, we have 2 defined instructions
    --> "./"
    --> "../"
* Based on these instructions, we will keep count of the operations that will be required
---------------------------------------------------------------
*/

#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int minOperations(vector<string>& logs) {
        int n = logs.size();
        int count = 0;

        for(int i=0;i<n;i++) {
            if(logs[i] == "../") {
                if(count == 0) {
                    continue;
                }
                count--;
            }
            else if(logs[i] == "./") {
                continue;
            }
            else {
                count++;
            }
        }

        if(count <= 0) {
            return 0;
        }

        return count;
    }
};