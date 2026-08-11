// Last updated: 11/08/2026, 18:46:30
class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        Map<Integer, Integer> rows = new HashMap<>();
        Map<Integer, Integer> cols = new HashMap<>();
        Map<Integer, Integer> diag = new HashMap<>();
        Map<Integer, Integer> antiDiag = new HashMap<>();
        Set<Long> lampSet = new HashSet<>();
        for (int[] lamp : lamps) {
            long key = ((long) lamp[0] << 32) | (lamp[1] & 0xffffffffL);
            if (lampSet.add(key)){
                rows.put(lamp[0], rows.getOrDefault(lamp[0], 0) + 1);
                cols.put(lamp[1], cols.getOrDefault(lamp[1], 0) + 1);
                diag.put(lamp[0] - lamp[1],
                        diag.getOrDefault(lamp[0] - lamp[1], 0) + 1);
                antiDiag.put(lamp[0] + lamp[1],
                        antiDiag.getOrDefault(lamp[0] + lamp[1], 0) + 1);
            }
        }
        int[] ans = new int[queries.length];
        int[][] dirs ={
            {0,0},{0,1},{0,-1},{1,0},{-1,0},
            {1,1},{1,-1},{-1,1},{-1,-1}
        };
        for (int i = 0; i < queries.length; i++){
            int r = queries[i][0];
            int c = queries[i][1];
            if (rows.containsKey(r) ||
                cols.containsKey(c) ||
                diag.containsKey(r - c) ||
                antiDiag.containsKey(r + c))
                ans[i] = 1;
            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];
                if (nr < 0 || nr >= n || nc < 0 || nc >= n)
                    continue;
                long key = ((long) nr << 32) | (nc & 0xffffffffL);
                if (lampSet.remove(key)) {
                    decrease(rows, nr);
                    decrease(cols, nc);
                    decrease(diag, nr - nc);
                    decrease(antiDiag, nr + nc);
                }
            }
        }
        return ans;
    }
    private void decrease(Map<Integer, Integer> map, int key) {
        map.put(key, map.get(key) - 1);
        if (map.get(key) == 0)
            map.remove(key);
    }
}