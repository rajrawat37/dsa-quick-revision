public static Node findIntersection(Node head1, Node head2)
    {
        Node top=null;
        Node res=top;
        while(head1!=null && head2!=null){
             if(head1.data==head2.data){
                Node newNode = new Node(head1.data);
                if(top==null){
                     top=newNode;
                     res=top;
                }
                else
                {
                     top.next=newNode;
                     top=top.next;
                }
                head1=head1.next;
                head2=head2.next;
             }
             else if(head1.data<head2.data)
                head1=head1.next;
            else
                head2=head2.next;    
        }
        return res;
            
    }
