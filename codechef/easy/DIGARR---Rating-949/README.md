# DIGARR - Rating 949

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Rearranging digits to get a multiple of 5

Given a positive integer $N$, MoEngage wants you to determine if it is possible to rearrange the digits of $N$ (in decimal representation) and obtain a multiple of $5$.

For example, when $N = 108$, we can rearrange its digits to construct $180 = 36 \cdot 5$ which is a multiple of $5$.

### Input Format
- The first line contains an integer $T$, the number of test cases. The description of the $T$ test cases follow.
- Each test case consists of two lines
- The first line contains a single integer $D$, the number of digits in $N$.
- The second line consists of a string of length $D$, the number $N$ (in decimal representation). It is guaranteed that the string does not contain leading zeroes and consists only of the characters $0, 1, \dots 9$.
### Output Format
- For each test case, print $\texttt{Yes}$ if it is possible to rearrange the digits of $N$ so that it becomes a multiple $5$. Otherwise, print $\texttt{No}$.

You may print each character of the string in uppercase or lowercase (for example, the strings $\texttt{YeS}$, $\texttt{yEs}$, $\texttt{yes}$ and $\texttt{YES}$ will all be treated as identical).

### Constraints
- $1 \leq T \leq 1000$
- $1 \leq D \leq 1000$
- $1 \leq N \lt 10^{1000}$
- Sum of $D$ over all test cases $\leq 1000$.
### Sample 1:
Input
Output

```
3
3
115
3
103
3
119
```

```
Yes
Yes
No
```

### Explanation:

 **Test Case $1$:**  The given number is already divisible by $5$, therefore the answer is $\texttt{Yes}$.

 **Test Case 2:**  We can obtain $310 = 62 \cdot 5$ by rearranging the digits of $103$, so the answer is $\texttt{Yes}$.

 **Test Case 3:**  The only numbers that can be obtained by rearranging the digits of $119$ are $\{119, 191, 911\}$. None of these numbers are multiples of $5$, so the answer is $\texttt{No}$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T10:08:35.169Z  

```java
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

```

---

[View on CodeChef](https://www.codechef.com/problems/DIGARR)