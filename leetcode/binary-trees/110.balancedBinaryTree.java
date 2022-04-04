
class Solution {
    
    public int Height(TreeNode root){
        if(root == null)
            return 0;
        return 1+ Math.max(Height(root.left), Height(root.right));
    }
    
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);
        
        return (Math.abs(leftHeight-rightHeight)<=1 && isBalanced(root.left) && isBalanced(root.right));
    }
}