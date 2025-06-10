package Trees;

public class Path_Sum {

    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if(root == null) return false;
            return dfs(root, targetSum, 0);
        }
        public boolean dfs(TreeNode root, int targetSum, int currSum) {
            
            if(root.left == null && root.right == null) {
                return targetSum == (currSum + root.val);
            }

            if(root.left != null && dfs(root.left, targetSum, currSum + root.val)) return true;
            if(root.right != null && dfs(root.right, targetSum, currSum + root.val)) return true;

            return false;

        }
    }

}
