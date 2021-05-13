 Node sortedMerge(Node head1, Node head2) {
        
        Node head= new Node(0);
        Node res=head;
        if(head1==null)
          return head2;
        if(head2==null)
           return head1;
        while(head1!=null && head2!=null){
          if(head1.data<head2.data){ 
                    head.next=head1;
                    head1=head1.next;
                }
            else{
                    head.next=head2;
                    head2=head2.next;
                }
                  head=head.next;
            }
        if(head1!=null){
            head.next=head1;
        }
        if(head2!=null){
            head.next=head2;
        }
        return res.next;  
   } 
