// Last updated: 2/10/2026, 9:25:03 AM
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
     
        if (p == null && q == null) {
            return true;
        } 
        if (p == null || q == null || p.val != q.val) {
            return false;
        } 
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}