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
  

//My Approach

 public static Node findIntersection(Node head2, Node head1)
    {
        HashSet<Integer> set= new HashSet<>();
        while(head1!=null){
           set.add(head1.data);
           head1=head1.next;
         }
         Node res=new Node(0);
         Node ans=res,temp=res;
         while(head2!=null){
             if(set.contains(head2.data)){
                 temp.next=head2;
                 temp=temp.next;
             }
             head2=head2.next;
         }
        temp.next=null;
        return ans.next;
    }
