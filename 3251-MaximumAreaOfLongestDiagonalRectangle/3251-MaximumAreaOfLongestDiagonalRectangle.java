// Last updated: 11/08/2026, 15:58:53
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonal = 0;
        int maxArea = 0;
        for(int[] rectangle : dimensions){

            int length = rectangle[0];
            int width = rectangle[1];

            int diagonal = length * length + width * width;
            int area = length * width;
            if(diagonal > maxDiagonal){
                maxDiagonal = diagonal;
                maxArea = area;
            } 
            else if(diagonal == maxDiagonal && area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
}