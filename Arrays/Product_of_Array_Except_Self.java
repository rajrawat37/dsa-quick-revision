//space complexity is O(n) here
	     int n=sc.nextInt();
	     int []arr= new int[n];
	     for(int i=0;i<n;i++){
	      arr[i]=sc.nextInt();
	     }
	     int []left=new int[n];
	     int []right= new int[n];
	      
	         left[0]=1;
	         right[n-1]=1;
	     for(int i=1;i<n;i++)
	         left[i]=left[i-1]*arr[i-1];
	         
	     for(int i=n-2;i>=0;i--)
	          right[i] = right[i+1]*arr[i+1];
	         
	         
	         for(int i=0;i<n;i++)
	             System.out.print((left[i]*right[i]) + " ");

//for O(1) space complexity
 int n=sc.nextInt();
	     int []arr= new int[n];
	     for(int i=0;i<n;i++){
	      arr[i]=sc.nextInt();
	     }
	    int []prod= new int[n];
	    int temp=1;
	     for (int i = 0; i < n; i++) { 
            prod[i] = temp; 
            temp *= arr[i]; 
        } 
        temp = 1; 
        for (int i = n - 1; i >= 0; i--) { 
            prod[i] *= temp; 
            temp *= arr[i]; 
        } 
  
	         
	         for(int i=0;i<n;i++)
	             System.out.print(prod[i] + " ");
