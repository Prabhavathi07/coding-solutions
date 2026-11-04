import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int dhoni=sc.nextInt();
		int rohit=sc.nextInt();
		int kohli=sc.nextInt();
		if(dhoni>rohit && dhoni>kohli){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}

	}
}
