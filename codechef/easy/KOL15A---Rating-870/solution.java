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
		    int s=0;
		    String p=sc.next();
		    for(int j=0;j<p.length();j++){
		        if('0'<=p.charAt(j)&& p.charAt(j)<='9'){
		            s=(s+p.charAt(j)-'0');
		        }
		    }
		    System.out.println(s);
		}

	}
}
