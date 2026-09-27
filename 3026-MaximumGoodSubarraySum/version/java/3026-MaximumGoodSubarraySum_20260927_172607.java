// Last updated: 27/09/2026, 17:26:07
1class Solution {
2    public long maximumSubarraySum(int[] nums, int k) {
3        HashMap<Integer, Long> map = new HashMap<>();
4        map.put(nums[0], 0L);
5
6        long sum = 0;
7        long ans = Long.MIN_VALUE;
8
9        for (int i = 0; i < nums.length; i++) {
10            sum += nums[i];
11
12            if (map.containsKey(nums[i] - k)) {
13                ans = Math.max(ans, sum - map.get(nums[i] - k));
14            }
15
16            if (map.containsKey(nums[i] + k)) {
17                ans = Math.max(ans, sum - map.get(nums[i] + k));
18            }
19
20            if (i + 1 < nums.length) {
21                if (!map.containsKey(nums[i + 1]) ||
22                    map.get(nums[i + 1]) > sum) {
23                    map.put(nums[i + 1], sum);
24                }
25            }
26        }
27
28        return ans == Long.MIN_VALUE ? 0 : ans;
29    }
30}