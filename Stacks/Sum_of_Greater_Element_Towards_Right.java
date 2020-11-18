#Approach -1

	 while(t-->0){ 
	       long sum=0;
       int n=sc.nextInt();
       int []h= new int[n];
       for(int i=0;i<n;i++)
          h[i]=sc.nextInt();
        
        
    for(int i=0;i<n;i++){
          int j=i+1;
          while(j<n && h[i]>=h[j])
             j++;
             if(j<n)
               sum+=h[j];    
    }
    System.out.print(sum%1000000001);
    System.out.println();
}


#Approach-2

    Stack<Integer> s= new Stack<>();
    for(int i=n-1;i>=0;i--){
          while(!s.empty() && h[i]>=s.peek())
              s.pop();
             sum=sum+(s.empty()?0:s.peek());    
               
               s.push(h[i]);
    }
    System.out.print(sum%1000000001);
    System.out.println();
