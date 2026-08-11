// Last updated: 11/08/2026, 18:49:49
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String temp = s + s;
        return temp.substring(1,temp.length() - 1).contains(s); 
    }
}