class Solution {
    public int countDigits(int num) {
        int p=num;
        int count=0;
        while(p!=0){
        
            int digit=p%10;
            if(num%digit==0){
count++;
            }
            p=p/10;
        }
        return count;
    }
}