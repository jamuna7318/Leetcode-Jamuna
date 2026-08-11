// Last updated: 11/08/2026, 18:50:44
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expected = n*(n+1)/2;
        int actual = 0;
        for(int num : nums){
            actual+=num;
        }
        return expected - actual;
    }
}