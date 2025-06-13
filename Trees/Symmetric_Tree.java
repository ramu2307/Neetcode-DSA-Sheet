package Trees;

public class Symmetric_Tree {

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            return symmetric(root.left, root.right);
        }

        public boolean symmetric(TreeNode root1, TreeNode root2) {
            
            if(root1 == null && root2 == null) return true;
            if(root1 == null || root2 == null) return false;

            return root1.val == root2.val && symmetric(root1.left, root2.right) && symmetric(root1.right, root2.left);   
        }
    }
    
}