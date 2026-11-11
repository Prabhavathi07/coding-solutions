import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    int d=sc.nextInt();
		    int a[]=new int[n];
		    int b[]=new int[n];
		    for(int j=0;j<n;j++){
		        a[j]=sc.nextInt();
		    }
		    for(int j=0;j<n;j++){
		        b[j]=sc.nextInt();
		    }
		    int c1=d;
		    int c2=d;
		    int c3=2*d;
		    for(int j=0;j<n;j++){
		        c1=c1+a[j];
		        c2=c2+b[j];
		        c3=c3+Math.min(a[j],b[j]);
		    }
		    System.out.println(Math.min(c1,Math.min(c2,c3)));
		  
		    
		}

	}
}
