class GfG 
{
    public static Node rearrange(Node root)
    {
        if(root == null || root.next == null || root.next.next == null)
            return root;
        Node mid = getMid(root);
        Node nextList = mid.next;
        Node reverse = rev(nextList);
        mid.next = null;
        Node x = root;
        while(x != null && reverse != null){
            Node f1 = x.next;
            x.next = reverse;
            Node p1 = reverse.next;
            reverse.next = f1;
            reverse = p1;
            x = f1;
        }
        return root;
    }
    public static Node getMid(Node node){
        Node slow=node, fast= node;
        while(slow != null && fast != null &&  fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node rev(Node node){
        if(node == null || node.next == null)
            return node;
        Node prev,next;
        prev = next = null;
        while(node != null){
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }
}