
	public static Node findUnion(Node head1,Node head2)
	{
	    TreeSet<Integer> set= new TreeSet<>();
	    Node res= new Node(0);
	    Node head=res;
	    while(head1!=null){
	      set.add(head1.data);
	      head1=head1.next;
	    }
	    while(head2!=null){
	        set.add(head2.data);
	        head2=head2.next;
	    }
	    for(int i : set){
	     res.next=new Node(i);
	     res=res.next;
	    }
	    res.next=null;
	    return head.next;
 
	}
