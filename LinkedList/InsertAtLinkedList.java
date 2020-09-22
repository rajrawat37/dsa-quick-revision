    public Node insertAtBeginning(Node first,int data){
        Node newNode=new Node(data);
        if(first==null)
            return newNode;
        newNode.next=first;
        first=newNode;
        return newNode;
    }

    public Node insertAtEnd(Node first , int data) {
        Node newNode = new Node(data);
        Node curr= first;
        while (curr.next!=null) {
            curr = curr.next;
        }
        curr.next=newNode ;
        return first;
    }

    public Node insertAfter(Node previous,int data){
        if(previous==null) {
            System.out.println("THe given previous node cannot be null");
        }
        Node newNode=new Node(data);
        newNode.next=previous.next;
         previous.next=newNode;
         return previous;
    }
