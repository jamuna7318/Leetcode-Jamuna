// Last updated: 27/09/2026, 17:37:13
1import java.util.*;
2
3class Solution {
4    public int[] maxSlidingWindow(int[] nums, int k) {
5        int n = nums.length;
6        int[] result = new int[n - k + 1];
7
8        Deque<Integer> deque = new ArrayDeque<>();
9
10        for (int i = 0; i < n; i++) {
11
12            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
13                deque.pollFirst();
14            }
15
16            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
17                deque.pollLast();
18            }
19
20            deque.offerLast(i);
21
22            if (i >= k - 1) {
23                result[i - k + 1] = nums[deque.peekFirst()];
24            }
25        }
26
27        return result;
28    }
29}