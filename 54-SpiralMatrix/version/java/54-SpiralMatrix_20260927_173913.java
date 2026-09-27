// Last updated: 27/09/2026, 17:39:13
1class Solution {
2    public int minSteps(String s, String t) {
3        int[] count = new int[26];
4
5        for (int i = 0; i < s.length(); i++) {
6            count[s.charAt(i) - 'a']++;
7            count[t.charAt(i) - 'a']--;
8        }
9
10        int steps = 0;
11
12        for (int value : count) {
13            if (value > 0) {
14                steps += value;
15            }
16        }
17
18        return steps;
19    }
20}