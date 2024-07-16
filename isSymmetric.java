/*
# Problem Statement: Check if the tree is symmetric at the root node (mirror image at root node)
---------------------------------------------------------------
# Approach :
- create another method for helping in the traversal pass left and right nodes as arguments
- then perform opposite traversals on then to check if they are mirror images
- example -> root-right-left for 1 subtree and then root-left-right for the other subtree

---------------------------------------------------------------
*/


public boolean isSymmetric(TreeNode root) {
        return (root==null) || ishelp(root.right, root.left);
    }

    public boolean ishelp(TreeNode right, TreeNode left) {
        if(left==null || right==null) {
            return (left==right);
        }

        return (left.val == right.val) && ishelp(left.left, right.right) && ishelp(right.left, left.right);
    }
