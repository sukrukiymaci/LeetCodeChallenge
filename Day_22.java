/*
Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.

Example 1:

Input: [5,7]
Output: 4
Example 2:

Input: [0,1]
Output: 0

*/


//If case in the loop is critical here because if we dont put this case it exceeds the time limit. Every time number multiplies by two and and value becomes 0
class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int k = m++;
        while (m != n + 1) {
            if (k == 0) return 0;
            k = k & m;
            m++;
        }
        return k;
    }
}
