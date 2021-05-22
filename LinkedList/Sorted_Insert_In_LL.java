// My Approach
// node can be smaller then head node , greater then last node or less then or equal to some node

	public static Node sortedInsert(Node head,int data)
         {
            Node add = new Node(data);
            Node res=(head==null)?add:head;
            Node temp=res;
            int f=0;
                
            if(head.data>data) {
              res=add;
                f=1;
            }
             while(head!=null){
                if(head.next==temp || (head.next.data>=data && f==0)){
                         add.next=head.next;
                         head.next=add;
                         break;
                      }
                    head=head.next;
                 }
                 return res;
          }
