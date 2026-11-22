# TV - Rating 324

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Television Channels

You have a television which had $X$ working channels numbered $1, 2,..., X$. Unfortunately, due to a recent change, all  **even** -numbered channels stopped working.

For example if $X = 5$, channels numbered $2$ and $4$ have stopped working, while channels numbered $1$, $3$ and $5$ are still working.

Given $X$, can you tell how many channels are still working?

### Input Format
- The first and only line of input contains a single integer $X$.
### Output Format

Output the number of working channels.

### Constraints
- $1 \le X \le 100$
### Sample 1:
Input
Output

```
5

```

```
3

```

### Explanation:

As explained in the statement, channels $1$, $3$ and $5$ are still working, but channels $2$ and $4$ are not. Thus, the answer is $3$.

### Sample 2:
Input
Output

```
100

```

```
50

```

### Explanation:

Channels $1$, $3$, $5$, $7$,..., $99$ are still working. Carefully counting them, we know there are exactly $50$ working channels.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-22T03:17:47.635Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int c=0;
		int t=sc.nextInt();
		for(int i=1;i<=t;i++){
		    if(i%2!=0){
		        c++;
		    }
		}
		System.out.println(c);

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TV)