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
		    int flag=0;
		    int n=sc.nextInt();
		    String s=sc.next();
		    for(int j=0;j<n;j++){
		        if(s.charAt(j)=='0' || s.charAt(j)=='5'){
		            flag=1;
		        }
		    }
		    if(flag==1){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		    
		}

	}
}
