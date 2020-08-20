class Tree {
    /* Complete the function to get diameter of a binary tree */
    int lmax = 0 , rmax = 0;
    int diameter(Node root) {
        ldepth(root.left);
        rdepth(root.right);
        return(lmax + rmax)+1;
    }
    int ldepth(Node root){
        if(root == null)
            return 0;
        int left = ldepth(root.left);
        int right = ldepth(root.right);
        if(1+(Math.max(left,right)) > lmax)
            lmax = 1+(Math.max(left,right));
        return 1+(Math.max(left,right));
    }
    int rdepth(Node root){
        if(root == null)
            return 0;
        int left = rdepth(root.left);
        int right = rdepth(root.right);
        if(1+(Math.max(left,right)) > rmax)
            rmax = 1+(Math.max(left,right));
        return 1+(Math.max(left,right));
    }
}