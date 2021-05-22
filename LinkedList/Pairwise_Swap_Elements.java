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


//Wihtout swapping data by interchanging links


 public Node pairwiseSwap(Node head)
    {
        Node curr=new Node(0);
        curr.next=head;
        Node temp=curr;
        while(curr.next!=null && curr.next.next!=null){
            Node first=curr.next;
            Node second=curr.next.next;
            first.next=second.next;
            curr.next=second;
            second.next=first;
            curr=curr.next.next;
        }
        return temp.next;
    }

//T.C = O(n)
//S.C = O(1)
