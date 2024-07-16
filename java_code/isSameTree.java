/*
# Problem Statement: isSameTree
---------------------------------------------------------------
# Approach : 
- recursively check for the left and right subtrees of the given trees and do untill they are null then return
---------------------------------------------------------------
*/

public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null) {
            return (p==q);
        }
        return (p.val == q.val) && isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
     
    }
