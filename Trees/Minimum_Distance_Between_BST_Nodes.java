package Trees;

public class Minimum_Distance_Between_BST_Nodes {

    class Solution {
        Integer prev = null;
        int minDiff = Integer.MAX_VALUE;
        public int minDiffInBST(TreeNode root) {
            inOrder(root);
            return minDiff;
        }
        public void inOrder(TreeNode root) {
            if(root == null) return;
            inOrder(root.left);
            if(prev != null) {
                minDiff = Math.min(minDiff, root.val - prev);
            }
            prev = root.val;
            inOrder(root.right);
        }
    }
    
}