  public static void rearrange(Node odd)
    {
       Node first=odd,even=odd.next,temp=even,odd1=first;
        while(even!=null && even.next!=null){
            first.next=first.next.next;
            first=first.next;
            even.next=even.next.next;
            even=even.next;
        }
        first.next=reverse(temp);
        odd=odd1;
    }
    static Node reverse(Node head){
        Node prev=null;
        Node next;
        while(head!=null){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
