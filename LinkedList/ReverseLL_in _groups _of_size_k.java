 public static Node reverse(Node node, int k)
    {
        Node curr=node,prev=null,next=null;
        
        int c=0;
        
        while(curr!=null && c<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            c++;
         }
         if(next!=null){
             node.next=reverse(next,k);
         }
         return prev;
       }
