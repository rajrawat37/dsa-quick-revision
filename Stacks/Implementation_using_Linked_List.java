  public void push(int x) 
    { 
        Node temp = new Node(); 
        if (temp == null) { 
            System.out.println("Heap Overflow"); 
            return; 
        } 
        temp.data = x; 
        temp.next = top; 
        top = temp; 
    } 
    public boolean isEmpty() 
    { 
        return top == null; 
    } 

    public int peek() 
    { 
        if (!isEmpty()) { 
            return top.data; 
        } 
        else { 
            System.out.println("Stack is empty"); 
            return -1; 
        } 
    } 
    
    public void pop() 
    { 
        if (top == null) { 
            System.out.print("Stack Underflow"); 
            return; 
        }
        top = top.next; 
    } 
  
    public void display() 
    {
        if (top == null) { 
            System.out.printf("Stack Underflow"); 
            return; 
        } 
        else { 
            Node temp = top; 
            while (temp != null) { 
                System.out.println(temp.data+ "->"); 
                temp = temp.next; 
            } 
        } 
    } 
