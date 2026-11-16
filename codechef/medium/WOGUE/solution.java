import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    String s=sc.next();
		    String r=sc.next();
		    String ans="";
		    for(int j=0;j<5;j++){
		        if(s.charAt(j)==r.charAt(j)){
		            ans=ans+"G";
		        }
		        else{
		            ans=ans+"B";
		        }
		    }
		    System.out.println(ans);
		}
		

	}
}
