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
		    int n=sc.nextInt();
		    StringBuilder s=new StringBuilder(sc.next());
		    int c=0;
		    for(int j=0;j<n;j++){
		        int num=(s.charAt(n-2)-'0')*10+(s.charAt(n-1)-'0');
		        if(num%4==0){
		            c++;
		        }
		        char first=s.charAt(0);
		        s.deleteCharAt(0);
		        s.append(first);
		    }
		    System.out.println(c);
		}

	}
}
