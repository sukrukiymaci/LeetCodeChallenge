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
