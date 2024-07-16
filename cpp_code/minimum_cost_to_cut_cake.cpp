/*
# Problem Statement: To find the minimum cost required to cut a cake in 1 x 1 pieces
---------------------------------------------------------------
# How to think: 
* Upon observation, we understand that, we need to cut the line with the maximum cost first
* Because, if we do not cut it, we will have to cut it later, when there will be more parts, leading to increase in cost
* Now, suppose we cut the vertical line with the max cost(5) first
* It will lead to the creation of 2 seperate parts, which eventually contributes to the increase in the horizontal cuts(double) required to achieve the desired result
* And similarly, when we cut along the horizontal line
---------------------------------------------------------------
*/

#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int minimumCost(int m, int n, vector<int>& hor, vector<int>& ver) {
        sort(hor.begin(), hor.end(), greater<int>());
        sort(ver.begin(), ver.end(), greater<int>());

        int v = 0;
        int h = 0;

        int i = 0;
        int j = 0;
        int cost = 0;
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