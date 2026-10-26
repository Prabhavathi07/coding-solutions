class Solution {
    public int reverse(int x) {
        long rev=0;
        int p=x;
        while(p!=0){
            int temp=p%10;
            rev=rev*10+temp;
            p=p/10;
        }
       
        if(rev>Integer.MAX_VALUE ||rev<Integer.MIN_VALUE){
            return 0;
        }
        return (int)rev;

    }
}