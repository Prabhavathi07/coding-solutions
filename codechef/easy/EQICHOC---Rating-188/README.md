# EQICHOC - Rating 188

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Game Controller

Chef is playing a game where his character starts at position $0$.

Pressing the right button moves the character $1$ step to the right. Pressing the left button moves it $1$ step to the left.

Chef presses the right button $R$ times and the left button $L$ times. Find how many steps the character is from its starting position after all the presses.

### Input Format

The only line contains two space-separated integers $R$ and $L$.

### Output Format

Print the number of steps between the character's final position and its starting position.

### Constraints
- $0 \le R, L \le 100$
### Sample 1:
Input
Output

```
3 8
```

```
5
```

### Explanation:

The character finishes $5$ steps to the left of its starting position, so the distance is $5$.

### Sample 2:
Input
Output

```
4 4
```

```
0
```

### Explanation:

The character returns to its starting position.

### Sample 3:
Input
Output

```
10 2
```

```
8
```

### Explanation:

The character finishes $8$ steps to the right of its starting position, so the distance is $8$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-24T12:39:33.910Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int r;
if(a>b){
    r=a-b;
}
else{
    r=b-a;
}
	System.out.println(r);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/EQICHOC)