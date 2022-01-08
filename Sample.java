// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// class Solution:
//     def longestPalindrome(self, s: str) -> int:
//         k = set()
//         res= 0
//         for i in range(len(s)):
//             if s[i] in k:
//                 k.remove(s[i])
//                 res = res + 2
//             else: 
//                 k.add(s[i])
//         if len(k)>0:
//             res = res + 1
//         return res