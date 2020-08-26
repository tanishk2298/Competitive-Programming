class GfG {
    int postInd;
    Node buildTree(int in[], int post[], int n) {
        postInd = n-1;
        return tree(in, post, 0, n-1);
    }
    Node tree(int[] in, int[] post, int start, int end){
        if(start > end)
            return null;
        Node curr = new Node(post[postInd--]);
        int index = 0;
        for(int i=start;i<=end;i++){
            if(in[i] == curr.data){
                index = i;
                break;
            }
        }
        curr.right = tree(in, post, index+1, end);
        curr.left = tree(in, post, start, index-1);
        return curr;
    }
}