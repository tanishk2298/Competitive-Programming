class GfG
{
    // Function to find the nth node from end in the linked list
    // head: head of the linked list
    // n: nth node from end to find
    int getNthFromLast(Node head, int n)
    {
        Node fast = head, slow = head;
        while(n-->0){
            if(fast != null)
                fast = fast.next;
            else
                return -1;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}