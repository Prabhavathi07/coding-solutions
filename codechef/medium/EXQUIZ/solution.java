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
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    int s=sc.nextInt();
		    int ans=Integer.MAX_VALUE;
		    for(int c=0;c<=n;c++){
		        int w=4*c-s;
		        if(w>=0 && c+w<=n){
		            ans=Math.min(ans,c+w);
		        }
		    }
		    if(ans==Integer.MAX_VALUE){
		        System.out.println(-1);
		    }
		    else{
		        System.out.println(ans);
		    }
		}
	}
}
