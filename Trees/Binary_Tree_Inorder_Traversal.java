package Trees;
import java.util.*;

public class Binary_Tree_Inorder_Traversal {

    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            inOrder(root, ans);
            return ans;
        }
        public void inOrder(TreeNode root, List<Integer> ans) {
            if(root == null) return;

            inOrder(root.left, ans);
            ans.add(root.val);
            inOrder(root.right, ans);
        }
    }

}