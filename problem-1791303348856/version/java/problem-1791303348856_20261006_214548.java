// Last updated: 06/10/2026, 21:45:48
1class Solution {
2    public int sumDistance(int[] nums, String s, int d) {
3        long MOD = 1000000007L;
4        int n = nums.length;
5        long[] pos = new long[n];
6
7        for (int i = 0; i < n; i++) {
8            if (s.charAt(i) == 'L') {
9                pos[i] = (long) nums[i] - d;
10            } else {
11                pos[i] = (long) nums[i] + d;
12            }
13        }
14
15        Arrays.sort(pos);
16
17        long ans = 0;
18        long prefix = 0;
19
20        for (int i = 0; i < n; i++) {
21            ans = (ans + pos[i] * i - prefix) % MOD;
22            prefix = (prefix + pos[i]) % MOD;
23        }
24
25        return (int) ans;
26    }
27}