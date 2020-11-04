  public static int[] calculateSpan(int price[], int n)
    {
        Stack<Integer> s= new Stack<>();
        int []span= new int[n];
       for(int i=0;i<n;i++){ 
       
           while(!s.empty() && price[s.peek()]<=price[i])
              s.pop();

           span[i]=s.isEmpty()?i+1:i-s.peek();
           s.push(i);
             
    }
    return span;
  }
