package Trees;

public class Find_Bottom_Left_Tree_Value {

    class Solution {
        int row;
        int val;
        public int findBottomLeftValue(TreeNode root) {
            row = -1;
            val = -1;
            inOrder(root, 0);
            return val;

        }
        public void inOrder(TreeNode root, int level) {
            if(root == null) return;
            inOrder(root.left, level + 1);
            if(level > row) {
                val = root.val;
                row = level;
            }
            inOrder(root.right, level + 1);
        }
    }
    
}