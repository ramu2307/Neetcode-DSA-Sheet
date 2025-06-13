package Trees;

public class Range_Sum_of_BST {

    class Solution {
        public int rangeSumBST(TreeNode root, int low, int high) {

            if(root == null) return 0;
            int total = 0;
            if(root.val >= low && root.val <= high) {
                total += root.val;
                total += rangeSumBST(root.left, low, high);
                total += rangeSumBST(root.right, low, high);
            }
            else if(root.val < low) {
                total += rangeSumBST(root.right, low, high);
            }
            else if(root.val > high) {
                total += rangeSumBST(root.left, low, high);;
            }
            
            return total;
        }
    }
    
}