package Trees;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Create_Binary_Tree_From_Descriptions {

    class Solution {
        public TreeNode createBinaryTree(int[][] descriptions) {
            Set<Integer> set = new HashSet<>();
            Map<Integer, TreeNode> map = new HashMap<>();
            int n = descriptions.length;
            for(int i = 0; i < n; i++) {
                if(!map.containsKey(descriptions[i][0])) {
                    map.put(descriptions[i][0], new TreeNode(descriptions[i][0]));
                }

                if(!map.containsKey(descriptions[i][1])) {
                    map.put(descriptions[i][1], new TreeNode(descriptions[i][1]));
                }

                if(descriptions[i][2] == 1) {
                    map.get(descriptions[i][0]).left = map.get(descriptions[i][1]);
                }
                else {
                    map.get(descriptions[i][0]).right = map.get(descriptions[i][1]);
                }
                set.add(descriptions[i][1]);
            }

            for(int i = 0; i < n; i++) {
                if(!set.contains(descriptions[i][0])) {
                    return map.get(descriptions[i][0]);
                }
            }
            return null;
        }
    }
    
}