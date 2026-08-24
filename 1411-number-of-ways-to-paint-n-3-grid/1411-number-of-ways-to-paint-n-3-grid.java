class Solution {
    public int numOfWays(int n) {
        int MOD=1_000_000_007;
        long A=6;
        long B=6;
        for(int i=1;i<n;i++){
            long newA=(A*3 + B*2)%MOD;
            long newB=(A*2 + B*2)%MOD;
            A=newA;
            B=newB;
        }
        return (int)((A+B)%MOD);
        
    }
}