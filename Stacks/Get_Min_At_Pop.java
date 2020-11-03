  public static Stack<Integer> _push(int arr[],int n)
    {
        Stack<Integer> stk= new Stack<>();
        int min=arr[0];
         for(int i=0;i<n;i++){
             min=Math.min(arr[i],min);
             stk.push(min);
         }
         return stk;
    }
    static void _getMinAtPop(Stack<Integer>s)
    {
         while(!s.empty()){
           System.out.print(s.pop()+" ");
    }
