import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
String p=sc.next();
int c=0,s=0,e=0,max=0;
for(int i=0;i<t;i++){
    if(p.charAt(i)=='m'){
        c++;
        if(max<c){
            max=c;
            e=i;
            s=i-c+1;
        }
    }
    else{
        c=0;
    }
}
System.out.println(s+" "+e);

	}
}
