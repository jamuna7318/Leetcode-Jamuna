// Last updated: 11/08/2026, 15:58:17
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;
        int mid=nums[n/2];
        int count =0;
        for(int x : nums){
            if(x==mid){
                count++;
            }
        }
        return count==1;
    }
}