// Last updated: 27/09/2026, 17:34:09
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int total = 0;
4
5        int maxSum = nums[0];
6        int currentMax = nums[0];
7
8        int minSum = nums[0];
9        int currentMin = nums[0];
10
11        for (int i = 0; i < nums.length; i++) {
12            if (i > 0) {
13                currentMax = Math.max(nums[i], currentMax + nums[i]);
14                maxSum = Math.max(maxSum, currentMax);
15
16                currentMin = Math.min(nums[i], currentMin + nums[i]);
17                minSum = Math.min(minSum, currentMin);
18            }
19
20            total += nums[i];
21        }
22
23        if (maxSum < 0) {
24            return maxSum;
25        }
26
27        return Math.max(maxSum, total - minSum);
28    }
29}