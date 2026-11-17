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
    int p=sc.nextInt();
    int q=p;
    int rev=0;
    while(p!=0){
        int d=p%10;
        rev=rev*10+d;
        p=p/10;
        
    }
    if(rev==q){
        System.out.println("wins");
    }
    else{
        System.out.println("loses");
    }
}
	}
}
