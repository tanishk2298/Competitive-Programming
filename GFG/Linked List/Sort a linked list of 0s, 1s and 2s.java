class LinkedList
{
    static Node segregate(Node head)
    {
        Node d0 = new Node(0), d1 = new Node(0), d2 = new Node(0);
        Node zero = d0, one = d1, two = d2;
        Node curr = head;
        while(curr != null){
            if(curr.data == 0){
                zero.next = curr;
                zero = zero.next;
            }
            else if(curr.data == 1){
                one.next = curr;
                one = one.next;
            }
            else if(curr.data == 2){
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;
        }
        head = d0.next;
        zero.next = (d1.next != null) ? d1.next : d2.next; 
        one.next = d2.next;
        two.next = null;
        return head;
    }
}