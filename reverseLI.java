import java.util.*;

class LinkedList{
    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static Node reverse(Node head)
    {
        Node current = head;
        Node temp = null;
        Node prev = null;

        while(current != null)
        {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        head =  prev;
        return head;
    }

    public static void printlist(Node head)
    {
        while(head != null)
        {
            System.out.print(head.data+" ");
            head = head.next;

        }
    }

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        list.head = new Node(15);
        list.head.next = new Node(32);
        list.head.next.next = new Node(45); 

        list.printlist(head);
        head = list.reverse(head);
        System.out.println();
        list.printlist(head);
    }
}