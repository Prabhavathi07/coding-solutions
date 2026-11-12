# ECHOECHO - Rating 231

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Echo

A string of length $4$ is called an  *echo*  if $S_1 = S_3$ and $S_2 = S_4$.
Here, we are using $1$-indexing.

You are given a string of length $4$. Check if it is an  *echo*.

### Input Format
- The first and only line of input will contain a single string $S$ of length $4$.
### Output Format

Print `Yes` if $S$ is an  *echo*, and `No` otherwise.

Each character of the output may be printed in either uppercase or lowercase, i.e. the strings `NO`, `No`, `nO`, and `no` will be treated as equivalent.

### Constraints
- $S$ has length $4$.
- $S$ consists of only lowercase English letters, i.e. the characters a, b, c,..., z.
### Sample 1:
Input
Output

```
meme

```

```
Yes

```

### Explanation:

The first and third characters of `meme` are both equal (to `m`), and its second and fourth characters are also both equal (to `e`).
So, `meme` is an  *echo*.

### Sample 2:
Input
Output

```
ever

```

```
No
```

### Explanation:

The second character of `ever` is `v`, while its fourth character is `r`. These are not equal, so `ever` is not an  *echo*.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T17:04:32.757Z  

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
		String p=sc.next();
		int len=p.length();
		int q=0;
		for(int i=0;i<p.length();i++){
		    if(p.charAt(0)==p.charAt(2) && p.charAt(1)==p.charAt(len-1)){
		        q=1;
		        
		    }
		}
		if(q==1){
		    System.out.println("Yes");
		}
		    else{
		        System.out.println("No");
		    }
		}

	}

```

---

[View on CodeChef](https://www.codechef.com/problems/ECHOECHO)