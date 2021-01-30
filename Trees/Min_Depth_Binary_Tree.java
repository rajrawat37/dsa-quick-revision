//BFS	
int minDepth(Node root)
	{
	   if(root==null)
	     return 0;
	   
	  Queue<Node> q= new LinkedList<>();
	  q.add(root);
	  int count=1;
	  while(!q.isEmpty()){
	        
	        int len=q.size();
	        for(int i=0;i<len;i++){ 
	            Node temp = q.poll();
	           
	           if(temp.left==null && temp.right==null)
	              return count;
	            
	           if(temp.left!=null)
	              q.add(temp.left);
	            if(temp.right!=null)
	               q.add(temp.right);
	        }
	        count++;
	  }
	  return count;
	}
