Node rearrangeEvenOdd(Node head)
    {
        if(head == null)
            return head;
        Node odd=head;
        Node even=head.next;
        Node feven=head.next;
        while(odd.next != null && even.next != null) {
            odd.next = even.next;
            odd = even.next;
            even.next = odd.next;
            even = odd.next;
        }
        odd.next=feven;
        return head;
    }
