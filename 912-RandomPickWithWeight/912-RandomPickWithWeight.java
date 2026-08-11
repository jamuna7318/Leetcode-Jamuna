// Last updated: 11/08/2026, 18:47:17
import java.util.*;

class Solution {
    int[] prefix;
    int total;
    Random random;
    public Solution(int[] w){
        prefix = new int[w.length];
        random = new Random();
        prefix[0]=w[0];
        for (int i=1;i<w.length;i++){
            prefix[i] =prefix[i-1]+w[i];
        }
        total = prefix[w.length - 1];
    }
    public int pickIndex(){
        int target = random.nextInt(total) + 1;
        int left = 0;
        int right = prefix.length - 1;
        while (left < right){
            int mid = left + (right - left)/2;
            if (prefix[mid] < target)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}