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
		    while(m!=0){
		        int temp=m;
		        m=n%m;
		        n=temp;
		    }
		   
		    System.out.println(n);
		}

	}
}
