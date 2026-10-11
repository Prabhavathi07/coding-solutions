# TELHOME - Rating 136

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Teleport Home

Chef has traveled a long way, and now wants to get home.

Chef is $D$ kilometers away from home, and he can walk at a speed of $1$ kilometer per hour.

Chef also has the ability to teleport. He can teleport for a distance of  **at most**  $T$ kilometers, which happens instantly and doesn't require any time.

The teleport can be used  **at most once**.

Find the  **minimum**  time, in hours, that Chef needs to reach home.

### Input Format
- The only line of input will contain two space-separated integers $D$ and $T$ — the distance away from home of Chef and the teleport distance, respectively.
### Output Format
- Output a single integer: the minimum time Chef needs to reach home.
### Constraints
- $1 \le D, T \le 200$
### Sample 1:
Input
Output

```
5 3
```

```
2
```

### Explanation:

Chef's house is $5$ kilometers away, and he can teleport up to $3$ kilometers.
So, it's optimal to teleport $3$ kilometers (which takes no time), and then walk the remaining $5-3=2$ kilometers. At a rate of $1$ kilometer per hour, this takes two hours, so the answer is $2$.

### Sample 2:
Input
Output

```
5 7

```

```
0
```

### Explanation:

Chef's house is $5$ kilometers away, and he can teleport up to $7$ kilometers.
Because $5 \le 7$, he can simply directly teleport to his home, taking $0$ hours.

### Sample 3:
Input
Output

```
63 12

```

```
51

```

### Explanation:

Chef's house is $63$ kilometers away, and he can teleport up to $12$ kilometers.
It's optimal to teleport $12$ kilometers (which takes no time), and then walk the remaining $63-12=51$ kilometers. At a rate of $1$ kilometer per hour, this takes $51$ hours, so the answer is $51$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T10:22:26.988Z  

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
		int d=sc.nextInt();
		int t=sc.nextInt();
		if(d>t){
		    System.out.println(d-t);
		}
		else{
		    System.out.println(0);
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TELHOME)