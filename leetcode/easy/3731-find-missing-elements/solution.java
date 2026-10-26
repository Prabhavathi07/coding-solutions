class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=nums[0],max=nums[0];
        for(int i=0;i<nums.length;i++){
if(min>nums[i]){
    min=nums[i];
}
else if(nums[i]>max){
    max=nums[i];
}
        }
List<Integer> missing=new ArrayList<>();
for(int j=min+1;j<=max-1;j++){
    boolean found =false;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==j){
            found=true;
            break;
        }
    }
    if(!found){
        missing.add(j);
    }
}
return missing;
        

    }
}