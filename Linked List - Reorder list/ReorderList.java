import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class ReorderList {
    Node head; // head of lisl

    /* Linked list Node */

    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    /* Function to print linked list */
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {

        /*
         * Constructed Linked List is 1->2->3->4->5->6-> 7->8->8->9->null
         */
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
/*
 * This is a function problem.You only need to complete the function given below
 */
/* Following is the Linked list node structure */
/*
 * class Node { int data; Node next; Node(int d) { data = d; next = null; } }
 */

class gfg {

    Node find_tail(Node h1){

        while(h1.next!=null){
            h1 = h1.next;
        }
        return h1;
    }

    Node find_tail_minus_one(Node h1){
        
        Node h2 = h1;
        Node t = find_tail(h1);
        print("t = " + t.data);

        while(h2.next != t){
            h2 = h2.next;
        }
        return h2;
    }
    

    Node reorderlist(Node head)
    {
        Node temp = head.next;
        Node new_ll, new_ll_add, t;
        Node h = head;
        //make a new LL from the old one.
        

        new_ll = new_ll_add = t = null;

        if((head.next == null) || (head.next.next == null)){
            return head;
        }

        t = find_tail(h);
        temp = h.next;

        while((temp.next != t) || (temp!=t) || (h!=t)){
            if(new_ll == null){
                new_ll = h.data;
                new_ll.next = t;
                new_ll_add = new_ll.next;
            }
            else{
                new_ll_add.next = h.data;
                new_ll_add = new_ll_add.next;
                new_ll_add.next = t;
                new_ll_add = new_ll_add.next;
            }
            if(h.next == null){
                new_ll_add.next = h;
                return new_ll;
            }
            h = h.next;
            temp = h.next;
            t = find_tail_minus_one(h);
            t.next = null;
            //t = find_tail(temp);
        }

        return head;
        
    }
}