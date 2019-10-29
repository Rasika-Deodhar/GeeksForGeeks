//Initial Template for Java
import java.util.*;
import java.io.*;
class Node {
    int data;
    Node prev, next;
    
    public Node (int d){
        this.data = d;
        prev = null;
        next = null;
    }
}
public class doubly_LL {
    
    static void display(Node node){
        while(node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println("Test cases : " + t);
		while(t > 0){
		    int n = sc.nextInt();
		    int p = sc.nextInt();
		       
		    //Entering the data
		    Node head = new Node(sc.nextInt());
		    Node curr = head;
		    
		    //Entering the rest of the list
		    for(int i=0; i<n-1; i++){
		        int d = sc.nextInt();
		        curr.next = new Node(d);
		        curr = curr.next;
		    }
            
            Gfg obj = new Gfg();
            display(obj.rotateP(head, p));
            t--;
		}
	}
}

/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*
class Node {
    int data;
    Node prev, next;
    
    public Node (int d){
        this.data = d;
        prev = null;
        next = null;
    }
}
*/
class Gfg {
    Node rotateP (Node head, int p){
        
        Node first_head, fh = null;
        first_head = fh = head;
        Node second_head = null;
        
        int i=0;
        while(i<p){
            head=head.next;
            i++;
        }
        second_head = head;
        head.prev = null;
        
        while(head.next!=null){
            head = head.next;
        }
        head.next = first_head;
        first_head.prev = head;

        while(first_head.next!=second_head){
            first_head = first_head.next;
        }
        first_head.next=null;
        
    return second_head;
    }
}