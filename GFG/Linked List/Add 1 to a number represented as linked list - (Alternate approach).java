class Sol
{
    public static Node addOne(Node head) 
    { 
        Node temp = rev(head);
        temp = add(temp);
        temp = rev(temp);
        return temp;
    }
    public static Node add(Node head){
        Node n = head;
        Node n2 = null;
        int carry = 1;
        while(head != null){
            int curr = head.data + carry;
            if(curr > 9){
                head.data = curr % 10;
            }
            else{
                carry = 0;
                head.data = curr;
            }
            n2 = head;
            head = head.next;
        }
        if(carry==1){
            Node n3 = new Node(1);
            n.next = n3;
        }
        return n;
    }
    public static Node rev(Node head){
        Node prev = null, next = null, curr = head;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    } 
}