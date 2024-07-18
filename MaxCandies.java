/*
# Problem Statement: Count the max candies id the extra candies are given to a child in the array
---------------------------------------------------------------
# Approach :
- calculate the max of the array beforehand
- then apply a for loop and check if it is greater than max after adding the extra candies
- return true and false accordingly
---------------------------------------------------------------
*/

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++) {
            if(max < candies[i]) {
                max = candies[i];
            }
        }

        ArrayList<Boolean> arr = new ArrayList<Boolean>();
        for(int i=0;i<candies.length;i++) {
            if((candies[i]+extraCandies) >= max) {
                arr.add(true);
            } else {
                arr.add(false);
            }
        }
        return arr;
    }
