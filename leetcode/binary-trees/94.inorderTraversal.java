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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversalImpl(root, result);
        return result;
    }
    
    public static void inorderTraversalImpl(TreeNode root, List<Integer> result){
        if(root == null)
            return ;
        inorderTraversalImpl(root.left, result);
        result.add(root.val);
        inorderTraversalImpl(root.right, result);
    }
}

//some thing to say:
// i struggled to write this recursion code even thought it was very easy and straight forward.
// you know why? I was out of practice.
