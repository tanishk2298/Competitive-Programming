class Tree
{
    // Return 1 if all the nodes in the tree satisfy the given property. Else return 0
    public static int isSumProperty(Node root)
    {
        if(root == null)
            return 1;
        if(root.left == null && root.right == null)
            return 1;
        int ans = 0;
        if(root.left != null)
            ans += root.left.data;
        if(root.right != null)
            ans += root.right.data;
        ans = (ans == root.data) ? 1 : 0;
        return(ans*isSumProperty(root.left)*isSumProperty(root.right));
    }
}