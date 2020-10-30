//Approach 1

static void reversequeue() 
	{ 
		Stack<Integer> stack = new Stack<>(); 
		while (!queue.isEmpty()) { 
			stack.add(queue.peek()); 
			queue.remove(); 
		} 
		while (!stack.isEmpty()) { 
			queue.add(stack.peek()); 
			stack.pop(); 
		} 
	} 

//Approach 2


 public Queue<Integer> rev(Queue<Integer> q){
	 
       Stack<Integer> st= new Stack<>();
       
       while(!q.isEmpty())
          st.push(q.poll());
          
       while(!st.isEmpty())
           q.offer(st.pop());
           
           return q;
    }
