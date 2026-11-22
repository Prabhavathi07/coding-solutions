import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int c=0;
		int t=sc.nextInt();
		for(int i=1;i<=t;i++){
		    if(i%2!=0){
		        c++;
		    }
		}
		System.out.println(c);

	}
}
