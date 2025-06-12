package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kth_Largest_Sum_in_a_Binary_Tree {

    class Solution {
        public long kthLargestLevelSum(TreeNode root, int k) {
            ArrayList<Long> list = new ArrayList<>();
            dfs(root, list, 0);
            Collections.sort(list, Collections.reverseOrder());
            if(k > list.size()) return -1;
            return list.get(k - 1);
        }
        public void dfs(TreeNode root, List<Long> list, int level) {
            if(root == null) return;
            if(list.size() < level + 1) {
                list.add((long)root.val);
            }
            else {
                list.set(level, list.get(level) + (long)root.val);
            }

            if(root.left != null) dfs(root.left, list, level + 1);
            if(root.right != null) dfs(root.right, list, level + 1);
        }
    }
    
}