# S01E01 - Rating 1106

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### The One Where It All Began

 *In a New York City coffee house called Central Perk, we're introduced to six friends: chef Monica Geller, data controller Chandler Bing who lives across the hall from Monica, Chandler's roommate/actor Joey Tribbiani, Monica's brother Ross Geller, new ageist Phoebe Buffay, and "born to be a wife" Rachel Green.* 

Chef wants to divide $N$ cookies between the  **six**  friends such that:

- Each friend gets at least one cookie.
- No two friends get the same number of cookies.

Find if it is possible for Chef to do so.

### Input Format
- First line will contain $T$, number of testcases. Then the testcases follow.
- Each testcase contains of a single line of input, one integers $N$.
### Output Format

For each test case print "YES" if Chef can divide the cookies according to the given rules, else print "NO".

You may print each character of each string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

### Constraints
- $1 \leq T \leq 10^3$
- $1 \leq N \leq 10^3$
### Sample 1:
Input
Output

```
3
42
5
909
```

```
YES
NO
YES
```

### Explanation:

 **Test case 1** : One possible way of distribution would be $2, 4, 6, 8, 10, 12$.

 **Test case 2** : It is impossible to divide $5$ cookies among six friends according to given rules.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-09T02:02:40.178Z  

```java
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
	    
	    if(n>=21){
	        System.out.println("YES");
	    }
	    else{
	        System.out.println("NO");
	    }
	}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/S01E01)