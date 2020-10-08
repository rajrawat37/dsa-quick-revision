 Node delete(Node head, int k)
    {
           if(k==1)
             return null;
           if(k==0)
             return head;
           else{
                int i=1;
                Node temp=head;
                while(temp!=null && temp.next!=null){
                    if(i%(k-1)==0){
                         temp.next=temp.next.next;
                    }
                    temp=temp.next;
                    i++;
                }
           }
           return head;
    }
