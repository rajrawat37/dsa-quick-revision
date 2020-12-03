//Recursive Solution

void inOrder(Node root)
{
    if(root == null)
        return;
        
    inOrder(root.left);
    
   System.out.println(root.data);
    
    inOrder(root.right);
}

//Non-Recursive Solution -1

 ArrayList<Integer> inOrder(Node root)
    {
        Stack<Node> stk= new Stack<>();
        ArrayList<Integer> list= new ArrayList<>();
        Node curr=root;
        if(root==null) 
          return list;
        while(curr!=null || !stk.empty()){
             while(curr!=null){
                  stk.push(curr);
                  curr=curr.left;
             }
             curr=stk.pop();
             list.add(curr.data);
             curr=curr.right;
    }
    return list;
  }
  
 //Non-Recursive Solution-2 (cpp)
  
  
  void inOrder(Node* root)
{
    stack<Node*> s;
    auto curr = root;
    
    while(!s.empty() || curr)
    {
      if(curr)  
      {
          s.push(curr);
          
          // Going left.
          curr = curr->left;
      }
      else
      {
          // Going up
          curr = s.top();
          s.pop();
          
          cout << curr->data << " ";
          
          // Going right
          curr = curr->right;
      }
    }
}
