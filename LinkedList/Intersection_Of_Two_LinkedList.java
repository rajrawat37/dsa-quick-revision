LinkedList getIntersection(Node head1, Node head2) 
    { 
        HashSet<Integer> hset = new HashSet<>(); 
        Node n1 = head1; 
        Node n2 = head2; 
        LinkedList result = new LinkedList(); 
  
        // loop stores all the elements of list1 in hset 
        while (n1 != null) { 
            if (hset.contains(n1.data)) { 
                hset.add(n1.data); 
            } 
            else { 
                hset.add(n1.data); 
            } 
            n1 = n1.next; 
        } 
  
        // For every element of list2 present in hset 
        // loop inserts the element into the result 
        while (n2 != null) { 
            if (hset.contains(n2.data)) { 
                result.push(n2.data); 
            } 
            n2 = n2.next; 
        } 
        return result; 
    } 
  
