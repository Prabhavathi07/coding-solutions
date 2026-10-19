import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int c=0;
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        if(i!=j && a[i]==a[j]){
		            c++;
		        }
		    }
		    if(c==0){
		        System.out.println(a[i]);
		    }
		}

	}
}
