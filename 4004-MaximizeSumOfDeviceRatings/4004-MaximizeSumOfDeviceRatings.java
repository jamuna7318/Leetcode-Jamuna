// Last updated: 11/08/2026, 15:58:40
class Solution {
    public long maxRatings(int[][] units) {
        long sum=0;
        int global=Integer.MAX_VALUE;
        int minSecond=Integer.MAX_VALUE;
        for(int[] device : units){
            Arrays.sort(device);
            global=Math.min(global,device[0]);

            if(device.length==1){
                sum+=device[0];
            }else{
                sum+=device[1];
                minSecond=Math.min(minSecond,device[1]);
            }
        }
        if(minSecond == Integer.MAX_VALUE){
            return sum;
        }
        return sum-minSecond+global;
    }
}