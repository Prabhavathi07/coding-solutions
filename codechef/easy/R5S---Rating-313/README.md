# R5S - Rating 313

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Reach 5 Star

Chef loves giving contests on Codechef. Chef wants to become $5$ star rated. Currently his rating on Codechef is $X$.
After today's contest, his rating will increase by $Y$. Note that $Y$ can be negative which means that Chef's rating will decrease.

Find whether Chef will become $5$ star rated after today's contest.
Chef will be considered $5$ star rated if his rating is greater than or equal to $2000$.

### Input Format

The first line contains two space-separated integers $X$ and $Y$ — chef's initial rating and the amount by which his rating will increase, respectively.

### Output Format

Output `YES` if chef will become $5$ star rated, and `NO` otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings `YES`, `yEs`, `yes`, and `yeS` will all be treated as identical).

### Constraints
- $0 \leq X \lt 2000$
- $-2000 \leq Y \lt 2000$
### Sample 1:
Input
Output

```
1900 100

```

```
YES
```

### Explanation:

Chef's current rating is $1900$, his rating increases by $100$. So his new rating becomes $2000$. Hence chef becomes $5$ star rated.

### Sample 2:
Input
Output

```
1999 -10

```

```
NO
```

### Explanation:

Chef's current rating is $1999$, and his rating decreases by $10$. So, his new rating becomes $1989$. Hence, Chef is unable to become $5$ star rated.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-23T12:02:12.986Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	int r=x+y;
	if(r>=2000){
	    System.out.println("Yes");
	}
	else{
	    System.out.println("No");
	}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/R5S)