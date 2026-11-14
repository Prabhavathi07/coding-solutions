# Majority Element

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `nums` of size `n`, return  *the majority element*.

The majority element is the element that appears more than `⌊n / 2⌋` times. You may assume that the majority element always exists in the array.

 

Original
Java
 **Example 1:** 

```
Input: nums = [3,2,3]
Output: 3

```

 **Example 2:** 

```
Input: nums = [2,2,1,1,1,2,2]
Output: 2

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 5 * 104
- -109 <= nums[i] <= 109
- The input is generated such that a majority element will exist in the array.

 

 **Follow-up:**  Could you solve the problem in linear time and in `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 90.27%)  
**Memory:** 63.1 MB (beats 41.27%)  
**Submitted:** 2026-11-14T11:29:43.488Z  

```java
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(count ==0){
                p=nums[i];
            }
           if(p==nums[i]){
            count++;
           }
           else{
            count--;
           }
        }
        return p;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element/)