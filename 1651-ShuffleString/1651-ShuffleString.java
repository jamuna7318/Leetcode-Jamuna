// Last updated: 11/08/2026, 15:59:27
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for (int i = 0;i<s.length();i++){
            result[indices[i]]=s.charAt(i);
        }
        return new String(result);
    }
}