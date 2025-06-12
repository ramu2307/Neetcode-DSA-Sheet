package Trees;

public class Reverse_Odd_Levels_of_Binary_Tree {

    class Solution {
        public TreeNode reverseOddLevels(TreeNode root) {
            dfs(root.left, root.right, 1);
            return root;
        }
        public void dfs(TreeNode root1, TreeNode root2, int level) {
            if(root1 == null || root2 == null) {
                return;
            }

            if(level % 2 == 1) {
                int temp = root1.val;
                root1.val = root2.val;
                root2.val = temp;
            }

            dfs(root1.left, root2.right, level + 1);
            dfs(root1.right, root2.left, level + 1);
        }
    }
    
}