// Last updated: 11/08/2026, 15:59:13
class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set=new HashSet<>();
        for(char c : sentence.toCharArray()){
            set.add(c);
        }
        return set.size()==26;
    }
}