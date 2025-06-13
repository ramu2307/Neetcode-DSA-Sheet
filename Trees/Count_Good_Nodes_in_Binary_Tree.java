package Trees;

public class Count_Good_Nodes_in_Binary_Tree {

    class Solution {
        int cnt;
        public int goodNodes(TreeNode root) {
            cnt = 0;
            postOrder(root, Integer.MIN_VALUE);
            return cnt;
        }
        public void postOrder(TreeNode root, int max) {
            if(root == null) return;

            if(root.val >= max) {
                cnt++;
                max = root.val;
            }
            postOrder(root.left, max);
            postOrder(root.right, max);
        }
    }
    
}