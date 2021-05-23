 static Node construct(int arr[][],int n)
    {
      Node start=new Node(arr[0][0]);
        Node ans=start;
        for(int i=0;i<n;i++){
            Node temp=start;
            for(int j=0;j<n;j++){
                
                if(j+1<n)
                  start.right=new Node(arr[i][j+1]);
                
                if(i+1<n)
                  start.down=new Node(arr[i+1][j]);
                
                if(start.right!=null)
                   start=start.right;
            }
            
            if(temp.down!=null)
            start=temp.down;
        }
        return ans;
    }
