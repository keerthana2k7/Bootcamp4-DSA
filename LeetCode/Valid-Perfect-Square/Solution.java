1class Solution {
2    public boolean isPerfectSquare(int num) {
3
4        long x = num;
5
6        while (x * x > num) {
7            x = (x + num / x) / 2;
8        }
9
10        return x * x == num;
11    }
12}