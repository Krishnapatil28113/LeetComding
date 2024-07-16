/*
# Problem Statement: To find the minimum cost to cut cake in 1 x 1 pieces
---------------------------------------------------------------
# How to think: 
* Similar to minimum cost to cut cake 1 --> Just change to long long
---------------------------------------------------------------
*/

#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    long long minimumCost(int m, int n, vector<int>& hor, vector<int>& ver) {
        sort(hor.begin(), hor.end(), greater<int>());
        sort(ver.begin(), ver.end(), greater<int>());

        int v = 0;
        int h = 0;

        int i = 0;
        int j = 0;
        long long cost = 0;
        while (i < m - 1 && j < n - 1) {
            if (ver[j] > hor[i]) {
                cost += (h + 1) * ver[j];
                j++;
                v++;
            } else {
                cost += (v + 1) * hor[i];
                i++;
                h++;
            }
        }

        while (i < m - 1) {
            cost += (v + 1) * hor[i];
            i++;
            h++;
        }

        while (j < n - 1) {
            cost += (h + 1) * ver[j];
            j++;
            v++;
        }

        return cost;
    }
};