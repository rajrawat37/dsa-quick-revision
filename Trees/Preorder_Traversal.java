ArrayList<Integer> list= new ArrayList<>();
  
      ArrayList<Integer> preOrder(Node root)
       {
        if(root==null)
              return list;
    Stack<Node> stk= new Stack<>();
    stk.push(root);
    while (!stk.isEmpty())
    {   
        Node curr=stk.pop();
        list.add(curr.data);
             
        if (curr.right != null)
            stk.push(curr.right);
                 
        if(curr.left!=null)
            stk.push(curr.left);
    }
    return list;
  }
