#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    string getSmallestString(string arr) {
        int n = arr.size();
        
        for(int i=0;i<n-1;i++) {
            if(arr[i]%2 == arr[i+1]%2) {
                //same parity
                if(arr[i+1] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    break;
                }
            }
        }

        return arr;
    }
};