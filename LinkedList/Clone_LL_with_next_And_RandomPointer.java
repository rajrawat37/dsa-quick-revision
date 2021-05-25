 Node copyList(Node head) {
        
         Node front = head;

        Node temp=head;
       while(temp!=null){
            Node copy= new Node(temp.data);
            copy.next=temp.next;
            temp.next=copy;
            temp=temp.next.next;
        }

         //  Second round: assign random pointers for the copy nodes.
         temp = head;
          while (temp != null) {
            if (temp.arb != null) {
              temp.next.arb = temp.arb.next;
            }
            temp = temp.next.next;
          }

        // clone list extraction
        temp = head;
        Node dummy = new Node(0);
        Node copy = dummy;

        while (temp != null) {
            front = temp.next.next;
            // extract the copy
            dummy.next = temp.next;
            dummy = dummy.next;
            // restore the original list
            temp.next = temp.next.next;
            temp = front;
          }
        return copy.next;
    }
