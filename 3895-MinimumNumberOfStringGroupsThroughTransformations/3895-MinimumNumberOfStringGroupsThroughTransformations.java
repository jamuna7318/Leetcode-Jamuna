// Last updated: 11/08/2026, 15:58:46
class Solution {
    public int minimumGroups(String[] words) {
        HashSet<String>uniqueGroups=new HashSet<>();
        for(String word:words){
            StringBuilder even =new StringBuilder();
            StringBuilder odd =new StringBuilder();
            for(int i=0;i<word.length();i++){
                if(i%2==0){
                    even.append(word.charAt(i));
                }else{
                    odd.append(word.charAt(i));
                }
            }
            String evenKey=getMinRotation(even.toString());
            String oddKey=getMinRotation(odd.toString());
            uniqueGroups.add(evenKey+"|"+oddKey);
        }
            return uniqueGroups.size();
    }
    private String getMinRotation(String s){
        if(s.length()==0){
            return s;
        }
        int n=s.length();
        String doubled=s+s;
        int i=0,j=1,k=0;
        while(i<n&&j<n&&k<n){
            char a=doubled.charAt(i+k);
            char b=doubled.charAt(j+k);
            if(a==b){
                k++;
            }else if(a>b){
                i+=k+1;
                if(i==j)i++;
                k=0;
            }else{
                j+=k+1;
                if(i==j)j++;
                k=0;
            }
        }
        int start=Math.min(i,j);
        return doubled.substring(start,start+n);
    }
}