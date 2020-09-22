import org.w3c.dom.Node;

import java.util.*;

public class LinkedList {
    private Node head;

    public void display(Node first) {
        Node curr = first;
        while (curr != null) {
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.print(curr);
    }

        private static class Node{
          private final int data;
           private Node next;


           public Node(int data){
              this.data=data;
               this.next=null;
           }
    }

    public static void main(String[] args) {

         Node first= new Node(10);  //making first node which points to null by default
         Node second= new Node(20);
         Node third= new Node(30);
         Node fourth= new Node(40);


         //all nodes point to null currently


        first.next=second;   // 10 --> 20
        second.next=third;   // 10 --> 20 --> 30
        third.next=fourth;   // 10 --> 20 --> 30 -->40

        LinkedList obj1= new LinkedList();
        obj1.display(first);
    }
}
