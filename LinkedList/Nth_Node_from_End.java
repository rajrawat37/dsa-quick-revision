 int getNthFromLast(Node head, int n)
    {
    	
    	Node temp=head;
    	int len=0;
    	while(temp!=null){
    	  len++;
    	  temp=temp.next;
    	}	
    	int key=len-n+1;
    	Node temp2=head;
    	int count=0;
    	while(temp2!=null){
    	    count++;
    	    if(count==key)
    	      return temp2.data;
    	      temp2=temp2.next;
    	}
    	return -1;
    		
    }
