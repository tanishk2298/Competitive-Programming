class Tree
{
    boolean isBalanced(Node root)
    {
        int ans = balanced(root);
        if(ans == -1)
            return false;
        return true;
    }
    int balanced(Node root){
        if(root == null)
	        return 0;
	int lh = balanced(root.left);
	int rh = balanced(root.right);
	if(lh == -1 || rh == -1)
	    return -1;
        if(Math.abs(lh-rh) > 1)
            return -1;
        else
            return Math.max(lh,rh) + 1;
    }
}