    static Node sortDoubly(Node head)
    {
        if(head==null || head.next==null)
           return head;
         
        Node mid=split(head);
        Node sh=mid.next;
        mid.next=null;
        
        Node fh=head;
        
        Node left=sortDoubly(fh);
        Node right=sortDoubly(sh);
        
        return merge(left,right);
    }
    
    public static Node split(Node head){
        Node slow =head,fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    public static Node merge(Node first,Node second){
        // If first linked list is empty
        if (first == null) {
            return second;
        }
 
        // If second linked list is empty
        if (second == null) {
            return first;
        }
 
        // Pick the smaller value
        if (first.data < second.data) {
            first.next = merge(first.next, second);
            first.next.prev = first;
            first.prev = null;
            return first;
        } else {
            second.next = merge(first, second.next);
            second.next.prev = second;
            second.prev = null;
            return second;
         }
    }
