package Trees;

public class Merge_Two_Binary_Trees {
        
    class Solution {
        public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            return dfs(root1, root2);
        }
        public TreeNode dfs(TreeNode root1, TreeNode root2) {
            if(root1 == null) return root2;
            if(root2 == null) return root1;

            TreeNode root = new TreeNode(root1.val + root2.val);
            root.left = dfs(root1.left, root2.left);
            root.right = dfs(root1.right, root2.right);

            return root;
        }
    }

}
