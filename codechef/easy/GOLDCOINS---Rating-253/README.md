# GOLDCOINS - Rating 253

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Gold Coins 101

Chef and Chefina are competing against each other in a football game where the player scoring the maximum goals, wins.

It is known that the winner of the game receives $A$ gold coins while the loser receives $B$ gold coins.
Given that Chef scored $X$ goals and Chefina scored $Y$ goals $(X \neq Y)$, find the number of coins Chef would receive.

### Input Format

The first and only line of input will contain four space-separated integers, $A, B, X,$ and $Y$, denoting the coins rewarded to winner, coins rewarded to loser, goals scored by Chef, and goals scored by Chefina respectively.

### Output Format

Output a single integer denoting the number of coins Chef would receive.

### Constraints
- $1 \leq B \lt A \leq 10$
- $1 \leq X,Y \leq 5, \ X \neq Y$
### Sample 1:
Input
Output

```
5 2 3 4

```

```
2
```

### Explanation:

Chef scored $3$ goals while Chefina scored $4$ goals. Thus, Chef loses and gets $2$ coins.

### Sample 2:
Input
Output

```
7 6 5 1

```

```
7
```

### Explanation:

Chef scored $5$ goals while Chefina scored $1$ goal. Thus, Chef wins and gets $7$ coins.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T17:48:57.617Z  

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
		int a=sc.nextInt();
		int b=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>y){
		    System.out.println(a);
		}
		else{
		    System.out.println(b);
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/GOLDCOINS)