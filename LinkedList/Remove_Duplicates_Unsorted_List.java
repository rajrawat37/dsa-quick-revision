  public Node removeDuplicates(Node head)
    {
         LinkedHashSet<Integer> set=new LinkedHashSet<>();
        Node ptr=head;
        Node prev=head;
        Node res=prev;
        while(ptr!=null){
            set.add(ptr.data);
            ptr=ptr.next;
        }
        for(int i :  set){
                prev.next = new Node(i);
                prev = prev.next;
        }
        return res.next;
    }


//Another Approach

 public Node removeDuplicates(Node head)
    {
        Node first = head;
        Node second = head.next;
        Set<Integer> set = new HashSet<>();
        set.add(head.data);
        while(second!=null) {
            if(set.contains(second.data)) {
                first.next = second.next;
            } else {
                set.add(second.data);
                first=first.next;
            }
            second = second.next;
        }
        return head;
    }
