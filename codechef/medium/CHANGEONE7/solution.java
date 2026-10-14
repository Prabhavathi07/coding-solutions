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
		    int a[]=new int[n];
		    for(int j=0;j<n;j++){
		        a[j]=sc.nextInt();
		    }
		   Arrays.sort(a);
		   int changeMin=a[n-1]-a[1];
		   int changeMax=a[n-2]-a[0];
		   System.out.println(Math.min(changeMin,changeMax));
		        
		    
		}

	}
}
