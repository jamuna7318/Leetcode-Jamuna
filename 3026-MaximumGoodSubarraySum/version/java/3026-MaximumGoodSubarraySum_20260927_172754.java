// Last updated: 27/09/2026, 17:27:54
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> findWinners(int[][] matches) {
5        Map<Integer, Integer> losses = new HashMap<>();
6
7        for (int[] match : matches) {
8            losses.putIfAbsent(match[0], 0);
9            losses.put(match[1], losses.getOrDefault(match[1], 0) + 1);
10        }
11
12        List<Integer> zeroLoss = new ArrayList<>();
13        List<Integer> oneLoss = new ArrayList<>();
14
15        for (int player : losses.keySet()) {
16            if (losses.get(player) == 0) {
17                zeroLoss.add(player);
18            } else if (losses.get(player) == 1) {
19                oneLoss.add(player);
20            }
21        }
22
23        Collections.sort(zeroLoss);
24        Collections.sort(oneLoss);
25
26        return Arrays.asList(zeroLoss, oneLoss);
27    }
28}