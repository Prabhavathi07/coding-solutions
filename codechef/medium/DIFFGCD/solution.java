import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your ce goes here
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
for(int i=0;i<t;i++){
    long n=sc.nextLong();
    long sum=0;
    long l=1;
    while(l<=n){
        long q=n/l;
        long r=n/q;
        sum=sum+q*(r-l+1);
        l=r+1;
    }
    System.out.println(sum-n);
}
	}
}
