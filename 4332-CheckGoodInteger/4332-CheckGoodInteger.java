// Last updated: 11/08/2026, 15:58:23
import java.util.*;
class Solution{
    public boolean checkGoodInteger(int n){
        int sum = 0;
        int sq=0;
        int temp=n;
        while(temp>0){
            int dg=temp%10;
            sum+=dg;
            sq+=dg*dg;
            temp/=10;
        }
        int res=sq-sum;
        return res>=50;
    }
}