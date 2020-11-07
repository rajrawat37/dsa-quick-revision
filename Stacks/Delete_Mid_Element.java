  int i=0;
    public Stack<Integer> deleteMid(Stack<Integer>st,int n)
    {
        if(i==Math.floor(n/2)){
            st.pop();
            return st;
        }
        int e = st.pop();
        i++;
        deleteMid(st,n);
        
        st.push(e);
        return st;
      
    } 
