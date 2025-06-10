package Trees;

public class Diameter_of_Binary_Tree {

    class Solution {
        int maxDiameter;
        public int diameterOfBinaryTree(TreeNode root) {
            if(root == null) return 0;
            maxDiameter = 0;
            diameterOfBT(root);
            return maxDiameter;
        }
        public int diameterOfBT(TreeNode root) {
            if(root == null) return 0;

            int left = diameterOfBT(root.left);
            int right = diameterOfBT(root.right);
            maxDiameter = Math.max(maxDiameter, left + right);
            return 1 + Math.max(left, right);
        }
    }
    
}