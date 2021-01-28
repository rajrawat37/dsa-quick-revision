public static Node reverseDLL(Node  head)
{
     
     Node curr=head;
    Node temp=null;
    while(curr!=null){
         temp=curr.next;
         curr.next=curr.prev;
         curr.prev=temp;
         head= curr;
         curr=temp;
    }
    return head;
}
