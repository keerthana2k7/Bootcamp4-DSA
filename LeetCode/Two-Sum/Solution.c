1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        Map<Integer, Integer> map = new HashMap<>();
4        for (int i = 0; i < nums.length; i++) {
5            int cur = nums[i];
6            int x = target - cur;
7            if (map.containsKey(x)) {
8                return new int[] { map.get(x), i };
9            }
10            map.put(cur, i);
11        }
12        return null;
13    }
14}
15