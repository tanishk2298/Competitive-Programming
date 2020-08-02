class Sol
{
    public static Node addOne(Node head) 
    { 
        int x = addOneToList(head);
        if(x == 1){
            Node n = new Node(1);
            n.next = head;
            return n;
        }
        return head;
    }
    public static int addOneToList(Node node){
        if(node == null)
            return 1;
        int ans = node.data + addOneToList(node.next);
        node.data = ans % 10;
        return ans / 10;
    }
}