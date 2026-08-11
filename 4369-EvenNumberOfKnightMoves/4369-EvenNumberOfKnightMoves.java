// Last updated: 11/08/2026, 15:58:21
class Solution {
    public boolean canReach(int[] start, int[] target) {
            int startColour = (start[0]+start[1])%2;
            int targetColour=(target[0]+target[1])%2;
            return startColour==targetColour;
        }
    }
