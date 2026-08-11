// Last updated: 11/08/2026, 18:52:18
import java.util.*;

class Solution {

    public int maxPoints(int[][] points) {

        if (points.length <= 2)
            return points.length;

        int answer = 2;

        for (int i = 0; i < points.length; i++) {

            HashMap<String, Integer> map = new HashMap<>();

            for (int j = i + 1; j < points.length; j++) {

                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                int g = gcd(dx, dy);

                dx /= g;
                dy /= g;

                // Normalize vertical line
                if (dx == 0) {
                    dy = 1;
                }

                // Normalize horizontal line
                if (dy == 0) {
                    dx = 1;
                }

                // Normalize sign
                if (dx < 0) {
                    dx = -dx;
                    dy = -dy;
                }

                String slope = dy + "/" + dx;

                map.put(slope, map.getOrDefault(slope, 1) + 1);

                answer = Math.max(answer, map.get(slope));
            }
        }

        return answer;
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return gcd(b, a % b);
    }
}