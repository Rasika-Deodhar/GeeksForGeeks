
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
class Driverclass
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new LinkedList().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}

/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class LinkedList
{
    static Node segregate(Node head)
    {
        List<Integer> l = new ArrayList<Integer>();
        Node h = head;
        Node h1 = null; Node h2 = null;
        
        while(h!=null){
            l.add(h.data);
            h = h.next;
        }
        
        Collections.sort(l);
        
        
        for(int i = 0; i < l.size(); i++){
            if(h1==null){
                h1 = new Node(l.get(i).intValue());
                h2 = h1;
            }
            
            h1.next = new Node(l.get(i).intValue());
            h1 = h1.next;
        }
        
        return h2.next;
        
    }
}