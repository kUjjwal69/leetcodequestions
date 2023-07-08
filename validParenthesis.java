/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.*/

import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack <Character> s1 = new Stack<Character>();
        for(int i = 0;i<s.length();i++){

            char c = s.charAt(i);

            if(c == '(' || c == '{' || c == '[') {
                s1.push(c);
            }
            else if( c ==')' ) {
                if(s1.isEmpty()||s1.pop()!='('){
                    return false;
                }
            }
            else if( c ==']' ) {
               if(s1.isEmpty()||s1.pop()!='['){
                    return false;
                }
            }
            else if( c =='}' ) {
                if(s1.isEmpty()||s1.pop()!='{'){
                    return false;
                }
            }
        }
        return s1.isEmpty();
    }
}
