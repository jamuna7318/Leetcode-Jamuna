// Last updated: 26/09/2026, 21:23:50
1class Solution {
2    public int minQueenMoves(int[] source, int[] target) {
3       int sr=source[0],sc=source[1];
4        int tr=target[0],tc=target[1];
5        if(sr==tr&&sc==tc){
6            return 0;
7        }
8        if(sr==tr||sc==tc||Math.abs(sr-tr)==Math.abs(sc-tc)){
9            return 1;
10        }
11        return 2;
12    }
13}