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
	    int a=sc.nextInt();
	    int s=0;
	    while(a!=0){
	        int temp=a%10;
	        s=s+temp;
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
