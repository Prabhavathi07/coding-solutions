class Solution {
    public int minRange(int a, int b, int c) {
        int p[]={a,b,c};
        Arrays.sort(p);
        int x=p[0];
        int y=p[1];
        int z=p[2];
        return Math.min(z-x,y);
    }
}