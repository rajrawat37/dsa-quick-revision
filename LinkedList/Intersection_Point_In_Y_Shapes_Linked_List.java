
	int intersectPoint(Node headA, Node headB)
	{
  int num_1=getCount(headA);
	int num_2=getCount(headB);
	if(num_1>num_2)
       return	getIntersection (num_1-num_2,headA,headB);

         else 
          return getIntersection(num_2-num_1,headB,headA);
	}
	int getIntersection(int num1,Node head1,Node head2){
	    for(int i=0;i<num1;i++)
	    if(head1!=null)
	    head1=head1.next;
	    
	    while(head1!=null&&head2!=null){
	    if(head1.next==head2.next)
	    return head1.next.data;
	    head1=head1.next;
	    head2=head2.next;
	    }
	    return -1;
	    
	}
	int getCount(Node head){
	    int num=0;
	    while(head!=null)
	    {
	        num++;
	        head=head.next;
	    }
	    return num;
	}



//Optimal Approach

	int intersectPoint(Node head1, Node head2)
	{
	    if(head1==null || head2==null) return -1;
	    
	    Node a=head1;
	    Node b=head2;
         while(a!=b){
             a=a==null?head2:a.next;
             b=b==null?head1:b.next;
             
         }
         return (a==null)?-1:a.data;
	}
