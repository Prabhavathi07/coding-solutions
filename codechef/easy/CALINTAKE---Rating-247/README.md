# CALINTAKE - Rating 247

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Calorie Intake

Chef has decided that he will cut down on his calorie intake. He will eat atmost $X$ calories in a day.

Today, he already ate $Y$ sweets, each having $Z$ calories. Find out how many more calories he can eat. If he has already exceeded his limit, output $-1$.

### Input Format
- The first and only line of input contains $3$ integers - $X, Y$ and $Z$.
### Output Format

For each test case, output on a new line

- $-1$ if Chef has exceeded his calorie limit
- The amount of calories Chef can still eat if he has not exceeded it
### Constraints
- $1 \le X, Y, Z \le 100$
### Sample 1:
Input
Output

```
10 2 4

```

```
2

```

### Explanation:

Chef was allowed to eat $8$ calories. He already ate $2 \cdot 4 = 8$. Therefore, he has $10 - 8 = 2$ calories more till he hits his limit.

### Sample 2:
Input
Output

```
10 2 6

```

```
-1
```

### Explanation:

Chef was allowed to eat $8$ calories, but he already ate $2 \cdot 6 = 12$. Therefore, he has exceeded his limit already, and we print $-1$.

### Sample 3:
Input
Output

```
100 10 10

```

```
0
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T16:16:02.962Z  

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
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
if(x>(y*z)){
    System.out.println(x-y*z);
}
else{
    System.out.println(-1);
}
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CALINTAKE)