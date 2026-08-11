// Last updated: 11/08/2026, 18:46:46
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int card : deck) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }
        int gcd = 0;
        for (int count : map.values()) {
            gcd = findGCD(gcd, count);
        }
        return gcd >= 2;
    }
    private int findGCD(int a, int b){
        while (b != 0){
            int temp =b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}