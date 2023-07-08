/*

Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.*/

class Solution {
    public String addBinary(String a, String b) {
    int alen = a.length();
int blen = b.length();
int i = 0;
int carry = 0;
String ans = "";

while (i < alen || i < blen || carry != 0) {
    int x = 0;
    if (i < alen && a.charAt(alen - i - 1) == '1') {
        x = 1;
    }

    int y = 0;
    if (i < blen && b.charAt(blen - i - 1) == '1') {
        y = 1;
    }

    int sum = x + y + carry;
    carry = sum / 2;
    int digit = sum % 2;

    ans = digit + ans;
    i++;
}
return ans;

    }
    }
