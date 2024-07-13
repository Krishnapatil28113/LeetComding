/*
# Problem Statement: How many water Bottles can you drink
---------------------------------------------------------------
# Approach : 
Used a math approach
---------------------------------------------------------------
*/

public int numWaterBottles(int numBottles, int numExchange) {
    return numBottles+(numBottles-1) / (numExchange-1);
}
