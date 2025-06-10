package Trees;

public class Balanced_Binary_Tree {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        public boolean isBalanced(TreeNode root) {
            boolean[] ans = new boolean[1];
            ans[0] = true;
            balanced(root, ans);
            return ans[0];
        }

        public int balanced(TreeNode root, boolean[] ans) {
            if(root == null || !ans[0]) return 0;

            int left = balanced(root.left, ans);
            int right = balanced(root.right, ans);

            int diff = Math.abs(left - right);
            if(diff > 1) ans[0] = false;

            return 1 + Math.max(left, right);

        }
    }
    
}