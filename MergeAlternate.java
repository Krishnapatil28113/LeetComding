/*
# Problem Statement: Merge 2 strings alternatively
---------------------------------------------------------------
# Approach :
- use string builder and define an empty string
- then run a while loop and che for the lengths and append the characters
---------------------------------------------------------------
*/

  public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
