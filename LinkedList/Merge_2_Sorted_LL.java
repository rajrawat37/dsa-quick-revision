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

//My Approach

Node mergeResult(Node node1, Node node2)
    {
	   node1=reverse(node1);
	   node2=reverse(node2);
	   
	   Node temp=new Node(0);
	   Node res=temp;
 
	   while(node1!=null && node2!=null){
	       if(node1.data>node2.data){
	           temp.next=node1;
	           node1=node1.next;
	       }
	       else{
	           temp.next=node2;
	           node2=node2.next;
	       }
	       temp=temp.next;
	   }
 
	   if(node1!=null) temp.next=node1;
	   if(node2!=null) temp.next=node2;
 
	   return res.next;
    }
    
    Node reverse(Node head){
        Node prev=null;
        Node future=head;
        while(head!=null){
            future=head.next;
            head.next=prev;
            prev=head;
            head=future;
        }
        return prev;
    }
