    Node reorderlist(Node node) {
        Node slow = node, fast = slow.next;
        Node res=node;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
 
        Node node1 = node;
        Node node2 = slow.next;
        slow.next = null;
 
        // Reverse the second half, i.e., 5 -> 4
        node2 = reverse(node2);
 
        // Merge alternate nodes
        node = new Node(0); // Assign dummy Node
 
        // curr is the pointer to this dummy Node, which
        // will be used to form the new list
        Node curr = node;
        while (node1 != null || node2 != null) {
 
            // First add the element from first list
            if (node1 != null) {
                curr.next = node1;
                curr = curr.next;
                node1 = node1.next;
            }
 
            // Then add the element from second list
            if (node2 != null) {
                curr.next = node2;
                curr = curr.next;
                node2 = node2.next;
            }
    }
    return res;
}
    Node reverse(Node curr){
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
