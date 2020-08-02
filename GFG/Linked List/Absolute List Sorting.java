class GfG
{
	Node sortedList(Node head)
	{
		Node curr = head;
		Node nxt = head.next;
		if((curr==null) || (nxt==null))
		    return head;
		while(nxt!=null){
            		if(nxt.data<0){
                		curr.next = nxt.next;
                		nxt.next = head;
                		head = nxt;
                		nxt = curr.next;
            		}
            		else{
                		curr = nxt;
                		nxt = nxt.next;
            		}
		}
		return head;
	}
}
