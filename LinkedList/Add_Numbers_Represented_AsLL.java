//N = 2
//valueN[] = {4,5}
//M = 3
//valueM[] = {3,4,5}
//Output: 3 9 0      

static Node addTwoLists(Node first, Node second){
        
        Node head= new Node(0);
        Node res=head;
        
        int carry=0;
        first=reverse(first);
        second=reverse(second);
        while(first!=null || second!=null){
            
            int val1=first!=null?first.data:0;
            int val2=second!=null?second.data:0;
            
            
            int sum=val1+val2+carry;
            carry=(sum>=10)?1:0;
            int last_digit=sum%10;
            
            Node temp=new Node(last_digit);
            res.next=temp;
            
            if(first!=null) first=first.next;
            if(second!=null) second=second.next;
            
            res=res.next;
        }
        if(carry>0){
            Node other=new Node(carry);
            res.next=other;
            res=res.next;
        }
        Node ans=reverse(head.next);
        return ans;
   
    }
    
    static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node next=null;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
