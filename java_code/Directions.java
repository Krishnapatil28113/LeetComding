/*
# Problem Statement: Step-By-Step Directions From a Binary Tree Node to Another 
---------------------------------------------------------------
# Approach : 
Define the function Lowest Common Ancestor of a Binary Tree.
Define bool dfs(TreeNode root, int x, StringBuilder path, bool rev)
in getDirections update root= LCA(root, startValue, destValue)
Perform dfs(root, startValue, pathFrom, true), dfs(root, destValue, pathTo, false)
pathFrom + pathTo is the answer
---------------------------------------------------------------
*/

public String getDirections(TreeNode root, int startValue, int destValue) {
        root = LCA(root, startValue, destValue);
        StringBuilder from = new StringBuilder();
        StringBuilder to = new StringBuilder();
        
        dfs(root, startValue, from, true);
        dfs(root, destValue, to, false);

        return from.toString() + to.toString(); 
    }

    public TreeNode LCA(TreeNode root, int p, int q) {
        if (root == null || root.val == p || root.val == q) {
            return root;
        }
        TreeNode left = LCA(root.left, p, q);
        TreeNode right = LCA(root.right, p, q);

        if (left == null) return right;
        else if (right == null) return left;
        else return root;
    }

    public boolean dfs(TreeNode root, int x, StringBuilder path, boolean rev) {
        if (root == null)
            return false;
        if (root.val == x)
            return true;

        path.append(rev ? 'U' : 'L');
        if (dfs(root.left, x, path, rev)) return true;
        path.deleteCharAt(path.length() - 1);

        path.append(rev ? 'U' : 'R');
        if (dfs(root.right, x, path, rev)) return true;
        path.deleteCharAt(path.length() - 1);

        return false;
    }
