import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int []a=new int[n];
		    int s=0;
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        s=s+a[i];
		    }
		    if(n<k || s%k!=0){
		        System.out.println("no");
		        continue;
		    }
		    int tar=s/k;
		    int count=0;
		    for(int i=0;i<n;i++){
		        for(int j=i+1;j<n;j++){
		            if(a[i]+a[j]==tar){
		                count++;
		                break;
		            }
		        }
		    }
		    if(count>=k){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}

	}
}
