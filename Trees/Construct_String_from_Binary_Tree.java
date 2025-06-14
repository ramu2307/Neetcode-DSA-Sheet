package Trees;

public class Construct_String_from_Binary_Tree {

    class Solution {
        public String tree2str(TreeNode root) {
            StringBuilder sb = new StringBuilder();
            preOrder(root, sb);
            return sb.toString();
        }
        public void preOrder(TreeNode root, StringBuilder sb) {
            
            sb.append(root.val);
            if(root.left != null) {
                sb.append('(');
                preOrder(root.left, sb);
                sb.append(')');
            }
            if(root.left == null && root.right != null) {
                sb.append('(').append(')');
            }
            if(root.right != null) {
                sb.append('(');
                preOrder(root.right, sb);
                sb.append(')');
            }
        }
    }
    
}