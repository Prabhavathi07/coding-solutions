# ZCOSCH - Rating 1012

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### How much Scholarship

The ZCO Scholarship Contest has just finished, and you finish with a rank of $R$. You know that Rank $1$ to Rank $50$ will get $100 \%$ scholarship on the ZCO exam fee and Rank $51$ to Rank $100$ will get $50 \%$ percentage scholarship on the ZCO exam fee. The rest do not get any scholarship.
What percentage of scholarship will you get ?

### Input Format
- Input consist of single line of input containing one integer $R$.
### Output Format
- Output a single line containing one integer — the percentage of scholarship you will get.
### Constraints
- $1 \le R \le 10^9$
### Sample 1:
Input
Output

```
49
```

```
100
```

### Explanation:

Since $1 \le 49 \le 50$, answer is $100$ percentage scholarship.

### Sample 2:
Input
Output

```
317
```

```
0
```

### Explanation:

Since $317 > 100$, you do not get any scholarship.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-10T16:25:20.705Z  

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
		int r=sc.nextInt();
		if(r>=1 && r<=50){
		    System.out.println(100);
		}
		else if(r>=51 && r<=100){
		    System.out.println(50);
		}
		else{
		    System.out.println(0);
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZCOSCH)