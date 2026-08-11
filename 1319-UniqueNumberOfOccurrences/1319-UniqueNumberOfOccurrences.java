// Last updated: 11/08/2026, 15:59:47
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int freq : map.values()){
            if (set.contains(freq))
                return false;
            set.add(freq);
        }
        return true;
    }
}