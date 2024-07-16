'''
LeetCode 1518: Water Bottles
Difficulty: Easy
Description:
There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.

The operation of drinking a full water bottle turns it into an empty bottle.

Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.
'''

class Solution:
    def numWaterBottles(self, numBottles: int, numExchange: int) -> int:
        maxDrinkCount = numBottles
        while numBottles >= numExchange:
            bottlesAfterExchange = numBottles // numExchange
            remainderBottles = numBottles % numExchange
            numBottles = bottlesAfterExchange + remainderBottles
            maxDrinkCount += bottlesAfterExchange
        return maxDrinkCount
'''
Approach: 
We can simulate the situation directly. Calculate the number of bottles that will be received after exchanging empty bottles, 
which is the quotient of numBottles divided by numExchange. The remaining bottles will remain empty for the next iteration.
Now update numBottles with the sum of the number of exchangeable bottles and the remaining empty bottles. This means that
we've exchanged the exchangeable bottles.
Update the maxDrinkCount by adding the number of bottles received after exchanged in that iteration, because we exchanged 
empty bottles with bottlesAfterExchange number of full bottles.
'''
