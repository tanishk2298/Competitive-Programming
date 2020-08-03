class Solution{
	public static Node zigZag(Node head){
	    if(head.next == null)
	        return head;
        Node n = head;
        int i = 0;
        while(n != null && n.next != null){
            if((i%2==0) && (n.data>n.next.data)){
                int curr = n.data;
                n.data = n.next.data;
                n.next.data = curr;
            }
            else if((i%2!=0) && (n.data<n.next.data)){
                int curr = n.data;
                n.data = n.next.data;
                n.next.data = curr;
            }
            n = n.next;
            i++;
        }
        return head;
    }
}