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
