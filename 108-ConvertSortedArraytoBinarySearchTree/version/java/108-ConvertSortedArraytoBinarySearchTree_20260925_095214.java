// Last updated: 25/09/2026, 09:52:14
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5
6        int child = 0;
7        int cookie = 0;
8
9        while (child < g.length && cookie < s.length) {
10            if (s[cookie] >= g[child]) {
11                child++;
12            }
13
14            cookie++;
15        }
16
17        return child;
18    }
19}