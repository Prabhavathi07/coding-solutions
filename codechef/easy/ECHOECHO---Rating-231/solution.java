import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String p=sc.next();
		int len=p.length();
		int q=0;
		for(int i=0;i<p.length();i++){
		    if(p.charAt(0)==p.charAt(2) && p.charAt(1)==p.charAt(len-1)){
		        q=1;
		        
		    }
		}
		if(q==1){
		    System.out.println("Yes");
		}
		    else{
		        System.out.println("No");
		    }
		}

	}
