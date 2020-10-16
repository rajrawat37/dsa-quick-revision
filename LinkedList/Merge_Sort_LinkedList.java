static Node mergeSort(Node h)
    {
         if (h == null || h.next == null) { 
            return h; 
        } 
        Node middle = getMiddle(h); 
        Node nextofmiddle = middle.next; 
        middle.next = null; 
        Node left = mergeSort(h); 
        Node right = mergeSort(nextofmiddle); 

        Node sortedlist = sortedMerge(left, right); 
        return sortedlist; 
    }
     static Node sortedMerge(Node a, Node b) 
    { 
        Node result = null; 
        if (a == null) 
            return b; 
        if (b == null) 
            return a; 
        if (a.data <= b.data) { 
            result = a; 
            result.next = sortedMerge(a.next, b); 
        } 
        else { 
            result = b; 
            result.next = sortedMerge(a, b.next); 
        } 
        return result; 
    }
   static  Node getMiddle(Node head) 
    { 
        if (head == null) 
            return head; 
  
        Node slow = head, fast = head; 
  
        while (fast.next != null && fast.next.next != null) { 
            slow = slow.next; 
            fast = fast.next.next; 
        } 
        return slow; 
    } 
