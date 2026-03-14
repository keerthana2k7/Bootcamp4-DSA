1class Solution {
2    public String addStrings(String num1, String num2) {
3
4        StringBuilder result = new StringBuilder();
5
6        int i = num1.length() - 1;
7        int j = num2.length() - 1;
8        int carry = 0;
9
10        while(i >= 0 || j >= 0 || carry != 0){
11
12            int sum = carry;
13
14            if(i >= 0){
15                sum += num1.charAt(i) - '0';
16                i--;
17            }
18
19            if(j >= 0){
20                sum += num2.charAt(j) - '0';
21                j--;
22            }
23
24            result.append(sum % 10);
25            carry = sum / 10;
26        }
27
28        return result.reverse().toString();
29    }
30}