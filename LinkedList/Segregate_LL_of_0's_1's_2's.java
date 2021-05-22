//My Approach by changing links in O(1) 

static Node segregate(Node head)
    {
        
        Node zero=new Node(0),one=new Node(0),two=new Node(0);
        Node p_zero=zero,p_one=one,p_two=two;
        
        while(head!=null){
            if(head.data==0){
                  zero.next=head;
                  zero=head;
            }
            else if(head.data==1){
                one.next=head;
                one=head;
            }
            else{
                two.next=head;
                two=head;
            }
            head=head.next;
        }
        
        zero.next=(p_one.next!=null)?p_one.next:p_two.next;
        one.next=p_two.next;
        two.next=null;
        return p_zero.next;
 
   }

// T.C - O(n)
// S.C - O(1) //dummy nodes does not effects space complexity as storage does not grows with increasing n
