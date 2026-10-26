class Solution {
    public int missingNumber(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++){
s=s+nums[i];
        }
        int o=(nums.length*(nums.length+1))/2;
        int r=o-s;
        return r;
    }
}