class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(count ==0){
                p=nums[i];
            }
           if(p==nums[i]){
            count++;
           }
           else{
            count--;
           }
        }
        return p;
    }
}