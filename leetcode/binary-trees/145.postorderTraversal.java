import java.util.ArrayList;
import java.util.List;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
    }
 }

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderTraversalImpl(root, result);
        return result;
    }

    public static void postorderTraversalImpl(TreeNode root, List<Integer> result) {
        if (root == null)
            return;
        postorderTraversalImpl(root.left, result);
        postorderTraversalImpl(root.right, result);
        result.add(root.val);
    }
}