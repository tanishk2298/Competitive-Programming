class Tree {
    /* Complete the function to get diameter of a binary tree */
    int max = 0;
    int diameter(Node root) {
        depth(root);
        return max;
    }
    int depth(Node root){
        if(root == null)
            return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        int currMax = 1+left+right;
        if(currMax > max)
            max = currMax;
        return (Math.max(left,right))+1;
    }
}