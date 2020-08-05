import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}


class gfg {
    Node reorderlist(Node head) {
        Node temp = head;
        Node slow = temp, fast = temp;
        while(slow != null && fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node slwnxt = slow.next;
        slow.next = null;
        Node reverse = rev(slwnxt);
        while(reverse != null){
            Node curr = temp.next;
            temp.next = reverse;
            temp = curr;
            if(temp == null)
                break;
            curr = reverse.next;
            reverse.next = temp;
            reverse = curr;
        }
        return head;
    }
    Node rev(Node head){
        Node prev = null, current = head, next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}

public class ReorderList {
    Node head; 
    Node last; 
    public void addToTheLast(Node node) {
	if (head == null) {
            head = node;
            last = head;
        } else {
            last.next = node;
            last = last.next;
        }
    }
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            ReorderList llist = new ReorderList();
	    int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }
	    llist.head = new gfg().reorderlist(llist.head);
            llist.printList();
            t--;
        }
    }
}