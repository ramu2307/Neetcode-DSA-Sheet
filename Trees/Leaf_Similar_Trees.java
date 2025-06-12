package Trees;

import java.util.ArrayList;

public class Leaf_Similar_Trees {

    class Solution {
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            if(root1 == null && root2 != null || root1 != null && root2 == null) return false;
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            dfs(root1, list1);
            dfs(root2, list2);
            return list1.equals(list2);

        }
        public void dfs(TreeNode root, ArrayList<Integer> list) {
            if(root.left == null && root.right == null) {
                list.add(root.val);
                return;
            }

            if(root.left != null) dfs(root.left, list);
            if(root.right != null) dfs(root.right, list);
        }
    }
    
}