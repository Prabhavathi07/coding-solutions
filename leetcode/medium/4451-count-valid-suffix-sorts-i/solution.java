class Solution {
    public int countSuffix(int[] nums, int[] target) {
        int n=nums.length;
       int [][] p={nums,target};
        int [] freq=new int[100001];
        int nonZero=0;
        int firstMismatch=n;
        for(int i=0;i<n;i++){
            if(nums[i]!=target[i]){
                firstMismatch=i;
                break;
            }
        }
        int c=0;
        boolean sorted =true;
        for(int i=n-1;i>=0;i--){
            int a=p[0][i];
            int b=p[1][i];
            if(freq[a]==0) nonZero++;
            freq[a]++;
            if(freq[a]==0) nonZero--;
            if(freq[b]==0) nonZero++;
            freq[b]--;
            if(freq[b]==0) nonZero--;
            if(i<n-1 && target[i]<target[i+1]){
                sorted=false;
            }
            if(i<=firstMismatch && nonZero==0 && sorted){
                c++;
            }
        }
        return c;
    }
}