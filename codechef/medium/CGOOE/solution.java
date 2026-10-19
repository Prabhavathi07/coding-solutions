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
		    int c=0;
		    for(int j=0;j<n;j++){
		        boolean g=true;
		        for(int k=Math.max(0,j-5);k<j;k++){
		            if(a[j]>=a[k]){
		                g=false;
		                break;
		            }
		        }
		        if(g){
		            c++;
		        }
		    }
		    System.out.println(c);
		}

	}
}
