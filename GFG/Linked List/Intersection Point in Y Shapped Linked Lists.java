class Intersect
{
	int intersectPoint(Node headA, Node headB)
	{
        	if(headA == null || headB == null)
            		return -1;
        	Node a = headA, b = headB;
        	while(a != b){
            		if(a == null)
                		a = headB;
            		else
                		a = a.next;
            		if(b == null)
                		b = headA;
            		else
                		b= b.next;
        	}
        	return a.data;
	}
}