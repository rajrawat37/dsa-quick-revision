class Solution
{
    Node compute(Node head)
    {
      head=reverse(head);
      int max=-1;
      Node ans=head;
      while(head!=null && head.next!=null){
         max=Math.max(max,head.data);
          if(head.next.data<max){
              head.next=head.next.next;
              continue;
          }
             head=head.next;
      }
      head=reverse(ans);
      ans=null;
      return head;
    }
    Node reverse(Node head){
        Node prev=null,next=null;
        while(head!=null){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}
  
