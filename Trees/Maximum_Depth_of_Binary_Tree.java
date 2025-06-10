package Trees;

public class Maximum_Depth_of_Binary_Tree {
    
    class Solution {
        int maxDepth;
        public int maxDepth(TreeNode root) {
            if(root == null) return 0;
            maxDepth = 0;
            findMaxDepth(root, 1);
            return maxDepth;
        }
        public void findMaxDepth(TreeNode root, int depth) {
            if(root == null) return;
            maxDepth = Math.max(maxDepth, depth);
            findMaxDepth(root.left, depth + 1);
            findMaxDepth(root.right, depth + 1);
        }
    }

}
