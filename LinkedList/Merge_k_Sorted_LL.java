//Used kind of minheap

Node mergeKList(Node[]arr,int K)
    {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
         for(Node head :  arr){
            while(head!=null){
              pq.add(head.data);
              head=head.next;
            }
        }
        Node dummy = new Node(0);
        Node head=dummy;
        while(!pq.isEmpty()){
             head.next=new Node(pq.remove());
             head=head.next;
        }
        return dummy.next;
        
    }
//T.C - O(nk log k)
//S.C - O(k)
