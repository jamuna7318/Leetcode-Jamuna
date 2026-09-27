// Last updated: 27/09/2026, 17:37:47
1import java.util.*;
2
3class Solution {
4    public List<List<String>> groupAnagrams(String[] strs) {
5        Map<String, List<String>> map = new HashMap<>();
6
7        for (String str : strs) {
8            char[] chars = str.toCharArray();
9            Arrays.sort(chars);
10
11            String key = new String(chars);
12
13            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
14        }
15
16        return new ArrayList<>(map.values());
17    }
18}