package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Vertical_Order_Traversal_of_a_Binary_Tree {

    class Solution {
        public List<List<Integer>> verticalTraversal(TreeNode root) {
            TreeMap<Integer, TreeMap<Integer, List<Integer>>> map = new TreeMap<>();
            dfs(root, 0, 0, map);
            List<List<Integer>> ans = new ArrayList<>();
            for(TreeMap<Integer, List<Integer>> entry : map.values()) {
                List<Integer> list = new ArrayList<>();
                for(List<Integer> list1 : entry.values()) {
                    Collections.sort(list1);
                    list.addAll(list1);
                }
                ans.add(list);
            }
            return ans;
        }
        public void dfs(TreeNode root, int level, int hd, TreeMap<Integer, TreeMap<Integer, List<Integer>>> map) {

            if(root == null) return;

            if(!map.containsKey(hd)) {
                map.put(hd, new TreeMap<>());
            }

            if(!map.get(hd).containsKey(level)) {
                map.get(hd).put(level, new ArrayList<>());
            }

            map.get(hd).get(level).add(root.val);

            dfs(root.left, level + 1, hd - 1, map);
            dfs(root.right, level + 1, hd + 1, map);

        }
    }

}
