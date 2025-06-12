package Trees;

import java.util.ArrayList;
import java.util.List;

public class Kth_Smallest_Element_in_a_BST {

    class Solution {
        public int kthSmallest(TreeNode root, int k) {
            List<Integer> ans = new ArrayList<>();
            dfs(root, k, ans);
            return ans.get(k - 1);
        }
        public void dfs(TreeNode root, int k, List<Integer> ans) {

            if(root.left != null) dfs(root.left, k, ans);
            ans.add(root.val);
            if(ans.size() == k) return;
            if(root.right != null) dfs(root.right, k,  ans);
        }
    }

}
