class Tree
{
    public ArrayList <Integer> bottomView(Node root)
    {
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Node> que = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null)
            return arr;
        que.add(root);
        int hd = 0;
        root.hd = 0;
        while(!que.isEmpty()){
            Node curr = que.poll();
            hd = curr.hd;
            map.put(hd, curr.data);
            if(curr.left != null){
                curr.left.hd = hd - 1;
                que.add(curr.left);
            }
            if(curr.right != null){
                curr.right.hd = hd + 1;
                que.add(curr.right);
            }
        }
        Iterator<Integer> itr = map.values().iterator();
        while(itr.hasNext())
            arr.add(itr.next());
        return arr;
    }
}