// Last updated: 27/09/2026, 17:35:36
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max = nums[0];
4        int min = nums[0];
5        int result = nums[0];
6
7        for (int i = 1; i < nums.length; i++) {
8            int current = nums[i];
9
10            if (current < 0) {
11                int temp = max;
12                max = min;
13                min = temp;
14            }
15
16            max = Math.max(current, max * current);
17            min = Math.min(current, min * current);
18
19            result = Math.max(result, max);
20        }
21
22        return result;
23    }
24}