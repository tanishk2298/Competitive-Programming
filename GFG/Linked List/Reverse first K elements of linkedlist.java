class GfG
{
    public static Node reverse(Node head, int k){
        Node prev = null, next = null, current = head, x = head, y = head;
        while(current != null && k-->0){
            y = current.next;
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        x.next = y;
        head = prev;
        return head;
    }
}