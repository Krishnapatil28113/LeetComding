/*
# Problem Statement: Find the lowest common ancestor of two nodes in a given tree 
---------------------------------------------------------------
# Approach : 
Start from the root node go to left and right then check for the the node to be reached
if the node us fount return the value or return null
if right return null and left return the value , the parent return the non null valye
else if both the nodes return value return the va;ue of root node 
---------------------------------------------------------------
*/

public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == root || q == root) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left == null) return right;
        else if (right == null) return left;
        else return root;

    }
