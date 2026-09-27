// Last updated: 27/09/2026, 17:27:20
1class Solution {
2    public int maxTurbulenceSize(int[] arr) {
3        int inc = 1;
4        int dec = 1;
5        int ans = 1;
6
7        for (int i = 1; i < arr.length; i++) {
8            if (arr[i] > arr[i - 1]) {
9                inc = dec + 1;
10                dec = 1;
11            } else if (arr[i] < arr[i - 1]) {
12                dec = inc + 1;
13                inc = 1;
14            } else {
15                inc = 1;
16                dec = 1;
17            }
18
19            ans = Math.max(ans, Math.max(inc, dec));
20        }
21
22        return ans;
23    }
24}