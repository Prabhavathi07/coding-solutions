class Solution {
    public long maxDifference(int[] nums) {
        int n=nums.length;
        long[]dp=new long[n+1];
        int[] m=nums;
        dp[n]=0;
        for(int i=n-1;i>=0;i--){
            long s1=m[i];
            if(s1%3==0){
                dp[i]=s1-dp[i+1];
            }
            else{
                dp[i]=s1+dp[i+1];
            }
            if(i+1<n){
                long s2=(long)m[i]+m[i+1];
                long score;
                if(s2%3==0){
                    score=s2-dp[i+2]; 
                }
                else{
                    score=s2+dp[i+2];
                }
                dp[i]=Math.max(dp[i],score);
            }
        }
        return dp[0];
    }
}