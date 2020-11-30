    static int sumBT(Node head){
          if(head==null)
             return 0;
          
          return sumBT(head.right) + sumBT(head.left) + head.data;
    }
