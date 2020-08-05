class solver
{
    public static void removeLoop(Node head){
        Node slow = head.next, fast = head.next.next;
        boolean loop = false;
        while(slow != null && fast != null && fast.next != null){
            if(slow == fast){
                loop = true;
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        if(loop){
            slow = head;
            while(slow!=null && fast!=null && slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
            while(fast.next!=slow)
                fast=fast.next;
            fast.next=null;
        }
    }
}