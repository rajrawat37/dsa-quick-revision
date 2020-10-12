  public Node pairwiseSwap(Node head)
    {
        Node temp=head;
        while(temp!=null && temp.next!=null){
             int k=temp.data;
             temp.data=temp.next.data;
             temp.next.data=k;
             temp=temp.next.next;
        }
        return  head;
    }
