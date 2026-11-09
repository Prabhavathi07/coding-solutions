import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int p=0;p<t;p++){
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int gcd=0;
		    for(int i=1;i<=n && i<=m;i++){
		        if(n%i==0 && m%i==0){
		            gcd=i;
		        }
		        
		    }
		    System.out.println(gcd);
		}

	}
}
