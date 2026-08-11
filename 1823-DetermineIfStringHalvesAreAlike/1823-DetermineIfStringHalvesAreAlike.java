// Last updated: 11/08/2026, 15:59:21
class Solution {
    public boolean halvesAreAlike(String s) {
        int count1 = 0;
        int count2 = 0;
        int n = s.length();
        for(int i=0;i<n/2;i++){
            if(isVowel(s.charAt(i))){
                count1++;
            }
        }
        for(int i=n/2;i<n;i++){
            if (isVowel(s.charAt(i))){
                count2++;
            }
        }
        return count1==count2;
    }
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}