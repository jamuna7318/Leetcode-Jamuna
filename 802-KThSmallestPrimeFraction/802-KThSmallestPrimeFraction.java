// Last updated: 11/08/2026, 18:48:26
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k){
        int n = arr.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> arr[a[0]] *arr[b[1]]-arr[b[0]]*arr[a[1]]
        );
        for(int i=0;i<n-1;i++){
            pq.offer(new int[]{i,n-1});
        }
        while(--k > 0){
            int[] cur = pq.poll();
            int i = cur[0];
            int j = cur[1];
            if(j-1 >i){
                pq.offer(new int[]{i,j-1});
            }
        }
        int[] ans = pq.poll();
        return new int[]{arr[ans[0]], arr[ans[1]]};
      
    }
}