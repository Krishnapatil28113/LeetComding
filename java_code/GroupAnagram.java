/*
# Problem Statement: Given an array of strings strs, group the anagrams together.
---------------------------------------------------------------
# Approach :
- Create a map in which the key is the sorted words in form of characters and the value is the list of strings which matches
- then run a for loop and check for the values and store the vakues in the list 
- return the list of groups of anagrams
---------------------------------------------------------------
*/

public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String store = new String(chars);

            if(!map.containsKey(store)) {
                map.put(store, new ArrayList<>());
            }
            map.get(store).add(word);
        }
        return new ArrayList<>(map.values());
    }
