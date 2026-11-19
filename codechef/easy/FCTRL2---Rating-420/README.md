# FCTRL2 - Rating 420

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Small factorials

You are asked to calculate factorials of some small positive integers.

### Input

An integer t, 1<=t<=100, denoting the number of testcases, followed by t lines, each containing a single integer n, 1 <= n <= 100

### Output

For each integer n given at input, display a line with the value of n!

 **Note:**  For larger numbers, their factorial can overflows any available numeric data type in C.

### Sample 1:
Input
Output

```
4
1
2
5
3
```

```
1
2
120
6
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T11:36:21.718Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int p=sc.nextInt();
		    BigInteger fact=BigInteger.ONE;
		    for(int j=1;j<=p;j++){
		        fact=fact.multiply(BigInteger.valueOf(j));
		    }
		    System.out.println(fact);
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FCTRL2)