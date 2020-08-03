/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;


class Node{
    int data;
    Node next;
    Node(int key){
        data = key;
        next = null;
    }
}
class GFG {
    public static Node head;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-->0){
		    int n = sc.nextInt();
		    int f = sc.nextInt();
		    Node head = new Node(f);
		    Node temp = head;
		    for(int i=1;i<n;i++){
		        int num = sc.nextInt();
		        temp.next = new Node(num);
		        temp = temp.next;
		    }
		    Node ans = segregate(head);
		    print(ans);
		}
	}
	public static void print(Node head){
	    Node temp = head;
	    while(temp != null){
	        System.out.print(temp.data+" ");
	        temp = temp.next;
	    }
	    System.out.println("");
	}
	public static Node segregate(Node head){
	    Node currOdd = null, headOdd = null, currEven = null, headEven = null;
	    Node current = head;
	    while(current != null){
	        if(current.data % 2 == 0){
	            if(headEven == null){
	                headEven = current;
	                currEven = current;
	            }
	            else{
	                currEven.next = current;
	                currEven = current;
	            }
	        }
	        else{
	            if(headOdd == null){
	                headOdd = current;
	                currOdd = current;
	            }
	            else{
	                currOdd.next = current;
	                currOdd = current;
	            }
	        }
	        current = current.next;
	    }
	    if(headEven != null)
	        head = headEven;
	    else
	        head = headOdd;
	    if(currEven != null)
	        currEven.next = headOdd;
	    if(currOdd != null)
	        currOdd.next = null;
	    return head;
	}
}