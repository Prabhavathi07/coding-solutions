import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int minr=n,maxr=-1;
		    int minc=m,maxc=-1;
		    for(int i=0;i<n;i++){
		        String s=sc.next();
		        for(int j=0;j<m;j++){
		            if(s.charAt(j)=='1'){
		                minr=Math.min(minr,i);
		                maxr=Math.max(maxr,i);
		                minc=Math.min(minc,j);
		                maxc=Math.max(maxc,j);
		            }
		        }
		    }
		    int rows=maxr-minr+1;
		    int cols=maxc-minc+1;
		    System.out.println(rows*cols);
		    
		}
		

	}
}
