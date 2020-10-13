public static bool detectLoop(Node h) 
    { 
        HashSet<Node> s = new HashSet<Node>(); 
        while (h != null) { 
            // If we have already has this node 
            // in hashmap it means their is a cycle 
            // (Because you we encountering the 
            // node second time). 
            if (s.Contains(h)) 
                return true; 
  
            // If we are seeing the node for 
            // the first time, insert it in hash 
            s.Add(h); 
  
            h = h.next; 
        } 
  
        return false; 
    } 
