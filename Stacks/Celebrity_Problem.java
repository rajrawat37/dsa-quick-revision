  int celebrity(int M[][], int n){
       Stack<Integer> s= new Stack<>();
       
      for(int i=0;i<n;i++)
         s.push(i);
         
    while(s.size()>=2){ 
        int i=s.pop();
        int j=s.pop();
        if(M[i][j]==1)
           s.push(j);
         else
           s.push(i);
    }
    
    int pot=s.pop();
    for(int i=0;i<n;i++){ 
        if(i!=pot)
          if(M[i][pot]==0 || M[pot][i]==1)
             return -1;
    }
    return pot;
    }
