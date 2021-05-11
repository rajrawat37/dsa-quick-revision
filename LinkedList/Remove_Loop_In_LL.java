  public static void removeLoop(Node head){
        
        HashSet<Node> set= new HashSet<>();
        Node prev=null;
        while(head!=null){
            if(set.contains(head)){
                prev.next=null;
                break;
            }
            set.add(head);
            prev=head;
            head=head.next;
        }
    }
