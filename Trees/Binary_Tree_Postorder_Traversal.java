package Trees;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Postorder_Traversal {

    class Solution {

        private void postOrder(TreeNode root, List<Integer> ans) {
            if(root == null) {
                return;
            }

            postOrder(root.left, ans);
            postOrder(root.right, ans);
            ans.add(root.val);
        }
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            postOrder(root, ans);
            return ans;
        }
    }
    
}