// Last updated: 11/08/2026, 15:58:43
class Solution {
    public boolean[] transformStr(String s, String[] strs) {
     int n=s.length();
        int[] prefS =new int[n];
        int current=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0')
                current++;
            prefS[i]=current;
        }
        int totalZeros=current;
        boolean[] ans=new boolean[strs.length];
        for(int j=0;j<strs.length;j++){
            String t=strs[j];
            int zeros=0;
            int questions =0;
            for(int i=0;i<n;i++){
                if(t.charAt(i)=='0')
                    zeros++;
                else if(t.charAt(i)=='?')
                    questions++;
            }
            if(zeros>totalZeros||zeros+questions<totalZeros){
                ans[j]=false;
                continue;
            }
            int need=totalZeros-zeros;
            int currentZeros=0;
            boolean ok=true;
            for(int i=0;i<n;i++){
                char c=t.charAt(i);
                if(c=='0')
                    currentZeros++;
                else if(c=='?'&&need>0){
                    currentZeros++;
                    need--;
                }
                if(currentZeros<prefS[i]){
                    ok=false;
                    break;
                }
            }
            ans[j]=ok;
        }
        return ans;
    }
}