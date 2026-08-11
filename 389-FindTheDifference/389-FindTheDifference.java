// Last updated: 11/08/2026, 18:50:09
class Solution {
    public char findTheDifference(String s, String t) {
        int result = 0;
        for(char ch:s.toCharArray()){
            result^= ch;
        }

        for(char ch:t.toCharArray()){
            result ^= ch;
        }
        return (char) result;
    }
}