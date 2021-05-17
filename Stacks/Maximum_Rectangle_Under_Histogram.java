  public static long getMaxArea(long hist[], long n) 
    {
      int []right=  new int[(int)n];
      int []left= new int [(int)n];
      
      Stack<Integer> stk= new Stack<>();
      

     stk.push(0);
     right[0]=-1;
     for(int i=1;i<n;i++){
        while(!stk.empty() && hist[i]<=hist[stk.peek()])
           stk.pop();
      
        if(!stk.empty())
          right[i]=stk.peek();
        else
          right[i]=-1;
       stk.push(i);
     }
    stk.clear();
    
    left[(int)n-1]=-1;
    stk.push((int)n-1);
        
        for(int i=(int)n-2;i>=0;i--){
             while(!stk.empty() && hist[i]<=hist[stk.peek()])
               stk.pop();
              
           if(!stk.empty())
               left[i]=stk.peek();
            else
               left[i]=-1;
               
           stk.push(i);
        }
        long area=0,max=-1l,width=0;
        for(int i=0;i<(int)n;i++){
            if(right[i]==-1 && left[i]==-1) width=n;
            else if(right[i]==-1) width=left[i];
            else if(left[i]==-1) width=n-right[i]-1;
            else width=left[i]-right[i]-1;
            area=(width)*hist[i];
            max=Math.max(max,area);
        }
        return max;
  }
