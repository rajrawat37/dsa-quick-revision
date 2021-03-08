public static Node constructTree(int pre[], int size) {
    return createBST(pre,0,size-1);
  }
  
 public static Node createBST(int []pre,int start , int end){
    if(start>end)
      return null;
    
       Node root=new Node(pre[start]);
       int i;
        for(i=start+1;i<=end;i++){
             if(pre[i]>root.data)
                    break;
        }
        
        root.left=createBST(pre,start+1,i-1);
        root.right=createBST(pre,i,end);
        return root;
  }
