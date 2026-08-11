// Last updated: 11/08/2026, 15:59:37
class Solution {
    public int removePalindromeSub(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return 2;
            }
            left++;
            right--;
        }
        return s.isEmpty()?0:1;
    }
}