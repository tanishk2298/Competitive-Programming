import java.util.*;

class Node
{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}

//Main Logic 

class GfG
{
    public static Node deleteAllOccurances(Node head, int x)
    {
        if(head.data == x)
            head = head.next;
        Node node = head;
        while(node != null && node.next != null){
            if(node.next.data == x)
                node.next = node.next.next;
            else
                node = node.next;
        }
        return head;
    }
}

class DeleteAllOccuances{
	Node head;
	public static void printList(Node head){
        	Node temp = head;
        	while (temp != null){
           		System.out.print(temp.data+" ");
           		temp = temp.next;
        	}  
        	System.out.println();
	}
	public static void main(String args[]){
        	Scanner sc = new Scanner(System.in);
		int t  =sc.nextInt();
		while(t>0){
			int n = sc.nextInt();
			int a1 = sc.nextInt();
			Node head = new Node(a1);
			Node tail = head;
            		for (int i = 1; i < n; i++){
				int a = sc.nextInt(); 
				tail.next = new Node(a);
				tail = tail.next; 
			}
			int x = sc.nextInt();
			 GfG g = new GfG(); 
			Node result = g.deleteAllOccurances(head, x);
			printList(result);
			t--;
		}
	}
}