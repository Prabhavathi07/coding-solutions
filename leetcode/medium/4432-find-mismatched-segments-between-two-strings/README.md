# Q1. Find Mismatched Segments Between Two Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two strings `s1` and `s2` of the same length.

A  **mismatched segment**  is a  **maximal contiguous**  range of indices where the characters of `s1` and `s2` differ at every index.

Return a 2D array containing `[sub1, sub2]` for each mismatched segment, where `sub1` and `sub2` are the corresponding  **substrings**  from `s1` and `s2`, respectively. Return the segments in  **increasing**  order of their starting indices. If there are no mismatched segments, return an empty array.

A  **substring**  is a contiguous  **non-empty**  sequence of characters within a string.

 

 **Example 1:** 

 **Input:**  s1 = "earth", s2 = "empty"

 **Output:**  [["ar","mp"],["h","y"]]

 **Explanation:** 

- The characters at indices 1 and 2 differ, forming the mismatched segment ["ar","mp"].
- The characters at index 4 differ, forming the mismatched segment ["h","y"].

 **Example 2:** 

 **Input:**  s1 = "action", s2 = "nation"

 **Output:**  [["ac","na"]]

 **Explanation:** 

The characters at indices 0 and 1 differ, forming the mismatched segment `["ac","na"]`. All remaining characters are equal in both strings.

 **Example 3:** 

 **Input:**  s1 = "hot", s2 = "hot"

 **Output:**  []

 **Explanation:** 

The two strings are identical, so there are no mismatched segments.

 

 **Constraints:** 

- 1 <= s1.length == s2.length <= 100
- s1 and s2 consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 50.00%)  
**Memory:** 46.4 MB (beats 100.00%)  
**Submitted:** 2026-11-08T03:18:31.175Z  

```java
class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> ans=new ArrayList<>();
        int n=s1.length();
        int i=0;
        while(i<n){
            if(s1.charAt(i)==s2.charAt(i)){
            i++;
        }
        else{
            int start=i;
            while(i<n && s1.charAt(i)!=s2.charAt(i)){
                i++;
            }
            String sub1=s1.substring(start,i);
            String sub2=s2.substring(start,i);
            List<String> temp=new ArrayList<>();
            temp.add(sub1);
            temp.add(sub2);
            ans.add(temp);
        }
    }
    return ans;
}
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-mismatched-segments-between-two-strings/)