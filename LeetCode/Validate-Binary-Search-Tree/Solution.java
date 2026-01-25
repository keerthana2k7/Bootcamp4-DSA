1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isValidBST(TreeNode root) {
18
19        List<Integer> list = new ArrayList<>();
20        inorder(root, list);
21
22        for (int i = 1; i < list.size(); i++) {
23            if (list.get(i) <= list.get(i - 1)) {
24                return false;
25            }
26        }
27        return true;
28    }
29
30    private void inorder(TreeNode root, List<Integer> list) {
31        if (root == null) return;
32
33        inorder(root.left, list);
34        list.add(root.val);
35        inorder(root.right, list);
36    }
37}