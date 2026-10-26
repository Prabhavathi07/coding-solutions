import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	int s=sc.nextInt();
		int []dp=new int[s+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=s;i++){
		    dp[i]=dp[i-1]+dp[i-2];
		}
		System.out.println(dp[s]);
		

	}
}
