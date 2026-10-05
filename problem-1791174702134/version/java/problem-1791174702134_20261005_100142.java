// Last updated: 05/10/2026, 10:01:42
1class Solution {
2    public String countAndSay(int n) {
3        String result = "1";
4
5        for (int i = 2; i <= n; i++) {
6            StringBuilder next = new StringBuilder();
7            int j = 0;
8
9            while (j < result.length()) {
10                char current = result.charAt(j);
11                int count = 0;
12
13                while (j < result.length() && result.charAt(j) == current) {
14                    count++;
15                    j++;
16                }
17
18                next.append(count).append(current);
19            }
20
21            result = next.toString();
22        }
23
24        return result;
25    }
26}