  public Node insertAtBeginning(Node first,int data){
        Node newNode=new Node(data);
        if(first==null)   // if the node is null then return  newnode only
            return newNode;
        newNode.next=first;   // else point the newNode.next to first node
        first=newNode;         //move the pointer of first node to newNode
        return newNode;          // return the newNode 
    }
    
        public void insertAfter(Node previous,int data){
        if(previous==null) {
            System.out.println("THe given previous node cannot be null");
            return ;
        }
        Node newNode=new Node(data);
        newNode.next=previous.next;
         previous.next=newNode;
    }


   public Node insertAtEnd(Node first , int data) {
        Node newNode = new Node(data);
        Node curr= first;
        while (curr.next!=null) {
            curr = curr.next;
        }
        curr.next=newNode ;
        return curr;
    }
