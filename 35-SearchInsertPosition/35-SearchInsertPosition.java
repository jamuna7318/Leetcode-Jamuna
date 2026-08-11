// Last updated: 11/08/2026, 18:53:23
class Solution {
  public int searchInsert(int[] nums, int target) {
    int l = 0;
    int r = nums.length;

    while (l < r) {
      final int m = (l + r) / 2;
      if (nums[m] == target)
        return m;
      if (nums[m] < target)
        l = m + 1;
      else
        r = m;
    }

    return l;
  }
}