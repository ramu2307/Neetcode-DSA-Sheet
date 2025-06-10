package Trees;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Right_Side_View {

    class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            dfs(root, ans, 0);
            return ans;
        }
        public void dfs(TreeNode root, List<Integer> ans, int level) {
            if(root == null) return;

            if(level == ans.size()) {
                ans.add(root.val);
            }
            dfs(root.right, ans, level + 1);
            dfs(root.left, ans, level + 1);
        }
    }
    
}