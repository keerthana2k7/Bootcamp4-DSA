1class Solution {
2    public int maximumProduct(int[] nums) {
3        
4        int max1 = Integer.MIN_VALUE;
5        int max2 = Integer.MIN_VALUE;
6        int max3 = Integer.MIN_VALUE;
7        
8        int min1 = Integer.MAX_VALUE;
9        int min2 = Integer.MAX_VALUE;
10        
11        for(int num : nums){
12            
13            if(num > max1){
14                max3 = max2;
15                max2 = max1;
16                max1 = num;
17            }
18            else if(num > max2){
19                max3 = max2;
20                max2 = num;
21            }
22            else if(num > max3){
23                max3 = num;
24            }
25            if(num < min1){
26                min2 = min1;
27                min1 = num;
28            }
29            else if(num < min2){
30                min2 = num;
31            }
32        }
33        
34        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
35    }
36}