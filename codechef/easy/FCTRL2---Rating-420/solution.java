import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int p=sc.nextInt();
		    BigInteger fact=BigInteger.ONE;
		    for(int j=1;j<=p;j++){
		        fact=fact.multiply(BigInteger.valueOf(j));
		    }
		    System.out.println(fact);
		}

	}
}
