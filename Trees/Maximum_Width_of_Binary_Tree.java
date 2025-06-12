package Trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class Maximum_Width_of_Binary_Tree {

    class Solution {
        public int widthOfBinaryTree(TreeNode root) {
            if(root == null) return 0;
            Queue<Pair> q = new ArrayDeque<>();
            q.add(new Pair(0, root));
            int maxWidth = 0;
            while(!q.isEmpty()) {
                int n = q.size();
                int first = 0;
                int last = 0;
                for(int i = 0; i < n; i++) {
                    Pair p = q.poll();
                    if(i == 0) first = p.id;
                    if(i == n - 1) last = p.id;

                    if(p.node.left != null) {
                        q.add(new Pair(2 * p.id + 1, p.node.left));
                    }
                    if(p.node.right != null) {
                        q.add(new Pair(2 * p.id + 2, p.node.right));
                    }

                }
                maxWidth = Math.max(maxWidth, last - first + 1);
            }
            return maxWidth;
        }
        class Pair {
            int id;
            TreeNode node;
            Pair(int id, TreeNode node) {
                this.id = id;
                this.node = node;
            }
        }
    }
    
}