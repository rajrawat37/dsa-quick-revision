	public static int getSize(Node node)
	{
          if(node==null) 
           return 0;
      
       int lht=getSize(node.left);
       int rht=getSize(node.right);
       int tht=lht+rht+1;
       return tht;
    }
