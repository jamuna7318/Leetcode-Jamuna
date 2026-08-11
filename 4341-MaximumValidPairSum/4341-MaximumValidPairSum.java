// Last updated: 11/08/2026, 15:58:18
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
       int n=nums.length;
        if(n<=k){
            return -1;
        }
        int maxpair=Integer.MIN_VALUE;
        int maxleft=nums[0];
        for(int j=k;j<n;j++){
            maxleft=Math.max(maxleft,nums[j-k]);
            maxpair=Math.max(maxpair,maxleft+nums[j]);
        }
        return maxpair;
    }
}