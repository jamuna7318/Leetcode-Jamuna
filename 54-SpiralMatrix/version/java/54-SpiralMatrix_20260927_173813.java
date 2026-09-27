// Last updated: 27/09/2026, 17:38:13
1class Solution {
2    public String longestPalindrome(String s) {
3        if (s.length() < 2) {
4            return s;
5        }
6
7        int start = 0;
8        int end = 0;
9
10        for (int i = 0; i < s.length(); i++) {
11            int len1 = expand(s, i, i);
12            int len2 = expand(s, i, i + 1);
13
14            int len = Math.max(len1, len2);
15
16            if (len > end - start + 1) {
17                start = i - (len - 1) / 2;
18                end = i + len / 2;
19            }
20        }
21
22        return s.substring(start, end + 1);
23    }
24
25    private int expand(String s, int left, int right) {
26        while (left >= 0 && right < s.length() &&
27               s.charAt(left) == s.charAt(right)) {
28            left--;
29            right++;
30        }
31
32        return right - left - 1;
33    }
34}