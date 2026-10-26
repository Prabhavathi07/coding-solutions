import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuilder result=new StringBulider();
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    if(i+1<s.length()&&s.charAt(i+1)=='#'){
		        char decoded=(char)('z'-(ch-'o'));
		        result.append(decoded);
		        i++;
		    }else{
		        char decoded=(char)('n'-(ch-'a'));
		        result.append(decoded);
		    }
		}
		System.out.println(result);

	}
}
