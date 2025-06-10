package Trees;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Level_Order_Traversal {

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
            dfs(root, ans, 0);
            return ans;
        }
        public void dfs(TreeNode root, List<List<Integer>> ans, int level) {
            if(root == null) return;

            if(ans.size() < level + 1) {
                ans.add(new ArrayList<>());
            }

            ans.get(level).add(root.val);
            dfs(root.left, ans, level + 1);
            dfs(root.right, ans, level + 1);

        }
    }
    
}