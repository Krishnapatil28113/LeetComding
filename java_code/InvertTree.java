/*
# Problem Statement: Invert a binary tree from root node 
---------------------------------------------------------------
# Approach : 
Used a recurssive approach
firstly go down until you reach leaf nodes then create a dummy node to store either left or right child
then swap the nodes and keep on going till you reach the root node
---------------------------------------------------------------
*/

public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        return root;
    }
