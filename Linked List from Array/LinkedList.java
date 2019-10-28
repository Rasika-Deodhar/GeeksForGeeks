import java.util.Scanner;

class LinkedList{

    static class Node{
        int data;
        Node next;
    }
    Node linkedList = null;

    Node makeNode(int number){
        Node n = new Node();
        n.data = number;
        n.next=null;

        return n;
    }

    Node arrayToLinkedList(int arr[]){

        Node newNode = null;
        Node pointer = this.linkedList;

        if(arr.length == 0){
            return null;
        }

        for(int i=0; i<arr.length; i++){

            if(i==0){
                this.linkedList = makeNode(arr[i]);
                pointer = this.linkedList;
            }
            else{
                pointer.next = makeNode(arr[i]);
                pointer = pointer.next;
                // this.linkedList.next = pointer;
                // this.linkedList.next = pointer.next;
            }
            //iterateLinkedList();
        }

        return this.linkedList;
    }

    void iterateLinkedList(){
        Node head = this.linkedList;
        while(head!=null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.print("null");
    }
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int n=0;
        Node ll_head=null;

        System.out.println("Enter size of an array: ");
        n = input.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array of given size: ");
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Entered array is: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }

        LinkedList ll = new LinkedList();
        ll_head = ll.arrayToLinkedList(arr);
        ll.iterateLinkedList();
    }
}