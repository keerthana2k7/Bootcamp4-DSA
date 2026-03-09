1public class Solution {
2    public boolean hasCycle(ListNode head) {
3
4        if (head == null) {
5            return false;
6        }
7
8        ListNode slow = head;
9        ListNode fast = head;
10
11        while (fast != null && fast.next != null) {
12            slow = slow.next;          // move 1 step
13            fast = fast.next.next;     // move 2 steps
14
15            if (slow == fast) {
16                return true;           // cycle found
17            }
18        }
19
20        return false; // no cycle
21    }
22}