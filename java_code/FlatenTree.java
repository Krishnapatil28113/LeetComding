/*
# Problem Statement: Flatten a Binary Tree to Linked List
---------------------------------------------------------------
# Approach : 
- the order of the linked list is same as preorder traversal of a tree
- first store the right side of the tree in a temp variable, then move the left side to the right side 
- then move to the right most of the tree and attacj the temp to the right of it
- continue this till it returns null (this is where the tree is flattened)
---------------------------------------------------------------
*/

public void flatten(TreeNode root) {
        if(root == null) {
            return ;
        }
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;

        TreeNode ptr = root;
        while(ptr.right != null) {
            ptr = ptr.right;
        }
        ptr.right = temp;

        flatten(root.right);
    }
