// Last updated: 27/09/2026, 17:33:32
1import java.util.*;
2
3class Solution {
4    public int longestConsecutive(int[] nums) {
5        Set<Integer> set = new HashSet<>();
6
7        for (int num : nums) {
8            set.add(num);
9        }
10
11        int longest = 0;
12
13        for (int num : set) {
14            if (!set.contains(num - 1)) {
15                int current = num;
16                int count = 1;
17
18                while (set.contains(current + 1)) {
19                    current++;
20                    count++;
21                }
22
23                longest = Math.max(longest, count);
24            }
25        }
26
27        return longest;
28    }
29}