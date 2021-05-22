//My Approach

static void linkdelete(Node head, int M, int N)
    {
        Node fast=head,slow=head;
        M--;
        int count=0,skip=N;
        while(fast!=null && slow!=null){
            if(count==M){
              while(fast!=null && skip-->0)
                 fast=fast.next;
               if(fast!=null)
                  slow.next=fast.next;
                else{
                   slow.next=null;
                   break;
                }
                slow=fast.next;
                fast=slow;
                skip=N;
                count=0;
            }
            else{
                count++;
              slow=slow.next;
              fast=fast.next;
            }
        }
    }
