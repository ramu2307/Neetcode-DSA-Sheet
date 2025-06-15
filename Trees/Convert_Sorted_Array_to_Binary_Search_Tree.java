package Trees;

public class Convert_Sorted_Array_to_Binary_Search_Tree {

    class Solution {

        public TreeNode sortedArrayToBST(int[] nums) {
            TreeNode root = sortedBST(0, nums.length - 1, nums);
            return root;
        }

        public TreeNode sortedBST(int left, int right, int[] nums) {

            if(left > right) return null;

            int mid = left + (right - left) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = sortedBST(left, mid - 1, nums);
            node.right = sortedBST(mid + 1, right, nums);

            return node;
        }
    }
    
}