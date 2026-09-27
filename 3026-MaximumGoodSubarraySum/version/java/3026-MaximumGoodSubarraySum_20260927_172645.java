// Last updated: 27/09/2026, 17:26:45
1import java.util.*;
2
3class Solution {
4    public int maximumSetSize(int[] nums1, int[] nums2) {
5        int n = nums1.length;
6
7        Set<Integer> set1 = new HashSet<>();
8        Set<Integer> set2 = new HashSet<>();
9
10        for (int x : nums1) set1.add(x);
11        for (int x : nums2) set2.add(x);
12
13        int common = 0;
14
15        for (int x : set1) {
16            if (set2.contains(x)) {
17                common++;
18            }
19        }
20
21        int unique1 = set1.size() - common;
22        int unique2 = set2.size() - common;
23
24        int take1 = Math.min(unique1, n / 2);
25        int take2 = Math.min(unique2, n / 2);
26
27        int remaining = n - take1 - take2;
28
29        return take1 + take2 + Math.min(common, remaining);
30    }
31}