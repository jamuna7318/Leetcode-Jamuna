// Last updated: 11/08/2026, 18:48:42
class Solution {
public String longestWord(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word : words)
            set.add(word);
        String answer = "";
        for (String word : words){
            boolean valid = true;
            for (int i=1;i<word.length();i++){
                if (!set.contains(word.substring(0, i))){
                    valid = false;
                    break;
                }
            }
            if (valid){
                if (word.length() > answer.length() ||
                   (word.length() == answer.length() &&
                    word.compareTo(answer) < 0)) {
                    answer = word;
                }
            }
        }
        return answer;
    }
}