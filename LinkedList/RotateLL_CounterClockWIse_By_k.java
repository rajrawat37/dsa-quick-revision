  public Node rotate(Node head, int k) {
        Node part=head;
        Node end=head;
        Node res=null;
        int count=0;
        while(count!=k-1){
            end=end.next;
            count++;
        }
        if(end.next!=null){
         part=end.next;
         end.next=null;
        }
        else 
         return head;
        res=part;
        while(part.next!=null){
            part=part.next;
        }
        part.next=head;
        return res;
    }
