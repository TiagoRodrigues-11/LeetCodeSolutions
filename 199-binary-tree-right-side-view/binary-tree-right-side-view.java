/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightSideList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Integer rightSide = null;
            int queueSize = queue.size();

            for(int i = 0; i < queueSize; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    rightSide = node.val;
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            if (rightSide != null) {
                rightSideList.add(rightSide);
            }
        }

        return rightSideList;
    }
}