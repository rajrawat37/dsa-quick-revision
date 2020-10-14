static boolean isCircular( Node head)
{
    if (head == null)
    return true;
 
    Node node = head.next;
 
    while (node != null && node != head)
        node = node.next;
    
    return (node == head);
}
