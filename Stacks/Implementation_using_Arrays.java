  
  int []stack = new int[n];
  int top=0;

  public void push(int data){
    if(isFull())
      System.out.println("-1");
    else
      stack[++top]=data;
    }
   
   
public int pop()
   {
     if(isEmpty())
	      return -1;
	   else{
       stack[top--];
       stack[top]=0;
     }
 }
   
   
public int peek()
  {
    return stack[top];
  }
   
public int size(){
    return top;
    }
    
public boolean isEmpty(){
     return top==-1;
     }
public boolean isFull(){
   return top==n-1;
}
   
   public void display()
   {
    for(int i : stack){ 
     System.out.print(i +" ");
     }
   }
