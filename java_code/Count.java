/*
# Problem Statement: Count the number of node in a complete binary tree
---------------------------------------------------------------
# Approach :
- check if the height of both the left and he rught sub tree is the same or not 
- then if they are equal apply the formula for counting the number of nodes based on the height
- if not got to the sub tree and perform the same thing again , use recurssion
---------------------------------------------------------------
*/

public int countNodes(TreeNode root) {
        if(root == null ){
            return 0;
        }

        int lh = getLeftHeight(root);
        int rh = getRightHeight(root);

        if(lh == rh) {
           return ((2<<(lh))-1);
        } else {
            return countNodes(root.left) + countNodes(root.right) + 1 ;
        }
    }

    public int getLeftHeight(TreeNode root) {
        int count = 0;
        while(root.left != null) {
            count++;
            root = root.left;
        }
        return count;
    }

        public int getRightHeight(TreeNode root) {
        int count = 0;
        while(root.right != null) {
            count++;
            root = root.right;
        }
        return count;
    }
