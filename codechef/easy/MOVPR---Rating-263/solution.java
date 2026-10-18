import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int r=2*x+3*y;
		int c=2*z+1*y;
		if(r>c){
		    System.out.println(c);
		}
		else{
		    System.out.println(r);
		}

	}
}
