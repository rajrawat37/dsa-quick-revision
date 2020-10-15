//Approach-1
public static boolean detectLoop(Node h){
      HashSet<Node> s = new HashSet<Node>(); 
        while (h != null) { 
            if (s.contains(h)) 
                return true; 
            s.add(h); 
            h = h.next; 
        } 
        return false; 
}

//Approach-2
//Floyd's Cycle finding Algorithm

 public static boolean detectLoop(Node head){
      Node slow = head, fast = head; 
        int flag = 0; 
        while (slow != null && fast.next != null) { 
            slow = slow.next; 
            fast = fast.next.next; 
            if (slow == fast) { 
                return true;
            } 
        } 
     return false;
}
