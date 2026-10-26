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
	    long a=sc.nextLong();
	    long s=0;
	    while(a>0){
	       
	        s=s+a%10;
	        a=a/10;
	    }
	    if(s%10==0){
	        System.out.println("Valid");
	    }
	    else{
	        System.out.println("Invalid");
	    }
	}

	}
}
