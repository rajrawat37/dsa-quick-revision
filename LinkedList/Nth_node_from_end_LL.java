int getNthFromLast(Node head, int n)
    {
        Node fast=head,slow=head;
        for(int i=0;i<n-1;i++){
          fast=fast.next;
          if(fast==null) return -1;
        }
          
         while(fast.next!=null){
             fast=fast.next;
             slow=slow.next;
         }
         return slow.data;
    }

//T.C = O(n)
//S.C = O(1)
