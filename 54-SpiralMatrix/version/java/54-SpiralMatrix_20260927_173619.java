// Last updated: 27/09/2026, 17:36:19
1import java.util.*;
2
3class Solution {
4    public int[][] merge(int[][] intervals) {
5        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
6
7        List<int[]> result = new ArrayList<>();
8
9        int start = intervals[0][0];
10        int end = intervals[0][1];
11
12        for (int i = 1; i < intervals.length; i++) {
13            if (intervals[i][0] <= end) {
14                end = Math.max(end, intervals[i][1]);
15            } else {
16                result.add(new int[]{start, end});
17                start = intervals[i][0];
18                end = intervals[i][1];
19            }
20        }
21
22        result.add(new int[]{start, end});
23
24        return result.toArray(new int[result.size()][]);
25    }
26}