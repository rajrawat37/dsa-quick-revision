public void deleteAlternate (Node head){
         Node prev=head;
         Node now=head.next;
          
           while(now!=null){
                prev.next=now.next;
                now=null;
                prev=prev.next;
                if(prev!=null){
                    now = prev.next;
                }
           }
          
          
          while(head!=null){
          System.out.print(head.data+" ");
          head=head.next;
          }
            
      
    }
}
