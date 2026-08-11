// Last updated: 11/08/2026, 18:51:06
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num))
              return true;
            set.add(num);
        }
        return false;
    }
}