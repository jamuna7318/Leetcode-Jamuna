// Last updated: 11/08/2026, 18:49:33
class Solution {
    public boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase())||word.equals(word.toLowerCase()) ||
               (Character.isUpperCase(word.charAt(0)) &&word.substring(1)
                    .equals(word.substring(1).toLowerCase()));
    }
}