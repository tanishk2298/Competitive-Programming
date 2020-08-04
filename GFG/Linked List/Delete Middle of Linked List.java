class Solution {
    Node deleteMid(Node head) {
        Node slow = head, fast = head;
        Node slowPrev = null;
        while(slow != null && fast != null && fast.next != null){
            slowPrev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        slowPrev.next = slow.next;
        return head;
    }
}