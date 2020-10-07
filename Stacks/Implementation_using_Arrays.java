  
  int []stack = new int[n];
  int top=0;
  public void push(int data){
    stack[top]=data;
    top++;
    }
   
   
  public int pop()
   {
    int data;
    top--;
    data=stack[top];
    stack[top]=0;
      return data;
  }
   
   
  public int peek()
   {
    int data;
    data=stack[top-1];
      return data;
  }
   
   public int size(){
    return top;
    }
    
    public boolean isEmpty(){
     return top<=0;
     }
   
   public void display()
   {
    for(int i : stack){ 
     System.out.print(i +" ");
     }
   }
