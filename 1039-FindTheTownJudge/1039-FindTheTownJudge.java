// Last updated: 11/08/2026, 18:46:28
class Solution {
    public int findJudge(int n,int[][] trust) {
        int[] t1=new int[n+1];
        int[] t2=new int[n+1];
        for (int i=0;i<trust.length;i++) {
            t1[trust[i][0]]++;
            t2[trust[i][1]]++;
        }
        int ans=-1;
        for (int i=1; i<=n;i++) {
            if (t1[i]==0 && t2[i]==n-1)
                ans=i;
        }
        return ans;
    }
}