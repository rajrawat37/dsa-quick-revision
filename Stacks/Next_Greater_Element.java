  public static long[] nextLargerElement(long[] arr, int n) { 
             Stack<Long> s= new Stack<>();
             long []ans= new long[n];
            
           for(int i=n-1;i>=0;i--){ 
                while(!s.empty() && s.peek()<arr[i])
                    s.pop();
                    
              ans[i]=s.empty()?-1l:s.peek();
             
             s.push(arr[i]);
           }
           return ans;
    }
