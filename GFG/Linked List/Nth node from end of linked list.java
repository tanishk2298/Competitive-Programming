class GfG
{
    // Function to find the nth node from end in the linked list
    // head: head of the linked list
    // n: nth node from end to find
    int getNthFromLast(Node head, int n)
    {
    	Node prev = null, next = null, current = head;
    	while(current != null){
    	    next = current.next;
    	    current.next = prev;
    	    prev = current;
    	    current = next;
    	}
    	head = prev;
    	current = head;
    	int count = 1;
    	while(current != null){
    	    if(count == n)
    	        return current.data;
    	    count++;
    	    current = current.next;
    	}
    	return -1;
    }
}