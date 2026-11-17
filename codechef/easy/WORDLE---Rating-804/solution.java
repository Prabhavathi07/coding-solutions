import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	    String s=sc.next();
	    String p=sc.next();
	    String res="";
	    for(int i=0;i<5;i++){
	        if(s.charAt(i)==p.charAt(i)){
	            res=res+"G";
	        }
	        else{
	            res=res+"B";
	        }
	    }
	    System.out.println(res);
	    }

	}
}
