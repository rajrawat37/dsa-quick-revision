  boolean isBST(Node root)
        {
            return check(root,null,null);
        }
    boolean check(Node root,Integer min,Integer max){
         
         if(root==null)
            return true;
          
         else if(max!=null && root.data>=max || min!=null && root.data<=min)
            return false;
        
         else
            return check(root.left,min,root.data) && check(root.right,root.data,max);
            
    }
