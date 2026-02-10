// Last updated: 2/10/2026, 9:24:49 AM
class Solution {
    private boolean isuni(TreeNode root, int val){
        if(root == null) return true;
        if(root.val != val) return false;
        boolean l = isuni(root.left, val);
        boolean r = isuni(root.right, val);
        return (l && r);
    }

    public boolean isUnivalTree(TreeNode root) {
        int val = root.val;
        return isuni(root,val);
    }
}