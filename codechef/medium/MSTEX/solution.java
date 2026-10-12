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
		    int N=sc.nextInt();
		    int K=sc.nextInt();
		    int[] arr=new int[N];
		    for(int j=0;j<N;j++){
		        arr[j]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		   int sum=0;
		    for(int j=N-1;j>=N-K;j--){
		        sum+=arr[j];
		    }
		    System.out.println(sum);
		    
		}
	

	}
}
