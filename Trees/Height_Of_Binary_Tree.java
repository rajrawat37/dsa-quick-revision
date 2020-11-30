   int height(Node node) {
         if(node==null) 
           return 0;
      
       int lht=height(node.left);
       int rht=height(node.right);
       int tht=Math.max(lht,rht)+1;
       return tht;
         
          
    }
