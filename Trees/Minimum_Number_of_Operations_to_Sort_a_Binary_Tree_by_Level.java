package Trees;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Minimum_Number_of_Operations_to_Sort_a_Binary_Tree_by_Level {

    class Solution {
        public int minimumOperations(TreeNode root) {
            Queue<TreeNode> q = new ArrayDeque<>();
            q.add(root);
            int cnt = 0;
            while(!q.isEmpty()) {
                int n = q.size();
                int[] arr = new int[n];
                for(int i = 0; i < n; i++) {
                    TreeNode temp = q.poll();
                    arr[i] = temp.val;
                    if(temp.left != null) q.add(temp.left);
                    if(temp.right != null) q.add(temp.right);
                }
                cnt += minOperations(arr);
            }
            return cnt;
        }
        public int minOperations(int[] arr) {
            int[] result = arr.clone();
            Map<Integer, Integer> map = new HashMap<>();
            int n = arr.length;
            for(int i = 0; i < n; i++) {
                map.put(arr[i], i);
            }
            int cnt = 0;
            Arrays.sort(result);
            for(int i = 0; i < n; i++) {
                if(arr[i] != result[i]) {
                    int idx1 = map.get(result[i]);
                    int idx2 = map.get(arr[i]);

                    map.put(result[i], idx2);
                    map.put(arr[i], idx1);

                    arr[idx1] = arr[i];
                    arr[idx2] = result[i];
                    cnt++;
                }
            }
            return cnt;
        }
    }

}
