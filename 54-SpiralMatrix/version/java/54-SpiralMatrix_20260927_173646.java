// Last updated: 27/09/2026, 17:36:46
1import java.util.*;
2
3class Solution {
4    public int lengthOfLongestSubstring(String s) {
5        Set<Character> set = new HashSet<>();
6
7        int left = 0;
8        int maxLength = 0;
9
10        for (int right = 0; right < s.length(); right++) {
11            while (set.contains(s.charAt(right))) {
12                set.remove(s.charAt(left));
13                left++;
14            }
15
16            set.add(s.charAt(right));
17            maxLength = Math.max(maxLength, right - left + 1);
18        }
19
20        return maxLength;
21    }
22}