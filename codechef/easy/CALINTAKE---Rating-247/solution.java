import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
if(x>(y*z)){
    System.out.println(x-y*z);
}
else{
    System.out.println(-1);
}
	}
}
