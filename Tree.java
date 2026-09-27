class Solution {
    public boolean Tree(TreeNode root) {
        return check(root.left, root.right);
    }

    public boolean check(TreeNode left, TreeNode right) {
        // Both are empty
        if (left == null && right == null) {
            return true;
        }

        // One is empty, the other is not
        if (left == null || right == null) {
            return false;
        }

        // Values must be equal
        if (left.val != right.val) {
            return false;
        }

        // Check mirror positions
        return check(left.left, right.right) &&
               check(left.right, right.left);
    }
}