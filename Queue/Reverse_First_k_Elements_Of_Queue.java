 public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    { 
         Stack<Integer> st= new Stack<>();
         Queue<Integer> qt= new LinkedList<>();
         
          for(int i=0;i<k;i++)
             st.push(q.poll());
             
             while(!q.isEmpty()){
                 qt.add(q.poll());
             }
             while(!st.isEmpty()){
                 q.add(st.pop());
             }
             while(!qt.isEmpty())
               q.add(qt.poll());
        
         return q;  
    }
