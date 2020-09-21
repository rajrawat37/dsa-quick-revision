Node reverseList(Node head)
    {
        Node curr=head;
        Node next=null;
        Node prev=null;
        
        while(curr!=null){
             next=curr.next;
             curr.next=prev;
             prev=curr;
             curr=next;
        }
        
        return prev;
        
    }
