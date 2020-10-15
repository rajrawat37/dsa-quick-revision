 static int countNodesinLoop(Node head)
    {
         Node fast=head;
         Node slow=head;
         while(slow!=null && fast!=null && fast.next!=null){
              slow=slow.next;
              fast=fast.next.next;
              if(fast==slow)
                return countlen(slow);
         }
         return 0;
    }
    static int countlen( Node n)  
      {  
       int len = 1;  
       Node temp = n;  
        while (temp.next != n)  
         {  
           len++;  
          temp = temp.next;   
          }  
     return len;  
}  
