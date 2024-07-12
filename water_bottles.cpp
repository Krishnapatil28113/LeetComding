/*
# Problem Statement: To find the maximum number of water bottles that can we can drink
---------------------------------------------------------------
# How to think:
* Firstly, we can drink all the bottles
* Then, we will have to generate the number of bottles in the set of numExchange which get generated
* Now, suppose in the case of numBottles = 15, and numExchange = 4
    --> After drinking all the 15 bottles, (15/4) filled bottles can be generated, i.e, 3
    --> Now, as 3 < numExchange, we won't be able to group them and generate a water bottle
    --> So, we will drink these 3 bottles and then we will be having, (3(15/4) + 3(15%4)) empty bottles
    --> Now, we have 6 empty bottles, therefore, (6/4), i.e, we can 1 group
* Therefore, the basic idea is to count the number of groups getting formed, adding them, and at each stage, check for the remainder, and then perform the further operations on the sum of both
    --> as they can contribute in generating a group
---------------------------------------------------------------
*/

#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
    int numWaterBottles(int numBottles, int numExchange)
    {
        int sum = numBottles;
        while (numBottles >= numExchange)
        {
            sum += numBottles / numExchange;
            numBottles = numBottles / numExchange + numBottles % numExchange;
        }

        return sum;
    }
};