1import java.util.HashSet;
2import java.util.Set;
3
4class Solution {
5    public int numComponents(ListNode head, int[] nums) {
6
7        Set<Integer> set = new HashSet<>();
8
9        for (int n : nums) {
10            set.add(n);
11        }
12
13        int count = 0;
14
15        while (head != null) {
16
17            if (set.contains(head.val) &&
18               (head.next == null || !set.contains(head.next.val))) {
19                count++;
20            }
21
22            head = head.next;
23        }
24
25        return count;
26    }
27}