// Last updated: 11/08/2026, 15:59:29
class Solution {
    public int maxPower(String s) {
        int max=1;
        int current=1;
        for (int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                current++;
            }else{
                current = 1;
            }
            max=Math.max(max, current);
        }
        return max;
    }
}