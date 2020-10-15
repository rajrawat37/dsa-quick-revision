LinkedList getIntersection(Node head1, Node head2) 
    { 
        HashSet<Integer> hset = new HashSet<>(); 
        Node n1 = head1; 
        Node n2 = head2; 
        LinkedList result = new LinkedList(); 
  
        // loop stores all the elements of list1 in hset 
        while (n1 != null) { 
            if (hset.contains(n1.data)) { 
                hset.add(n1.data); 
            } 
            else { 
                hset.add(n1.data); 
            } 
            n1 = n1.next; 
        } 
  
        // For every element of list2 present in hset 
        // loop inserts the element into the result 
        while (n2 != null) { 
            if (hset.contains(n2.data)) { 
                result.push(n2.data); 
            } 
            n2 = n2.next; 
        } 
        return result; 
    } 
  

//My Approach

 {
       LinkedHashMap<Integer,Integer> map= new LinkedHashMap<>();
        Node temp1=head1;
        Node temp2=head2;
        while(temp1!=null) {
            if (!map.containsKey(temp1.data))
                map.put(temp1.data, 1);
            else
                map.put(temp1.data, map.get(temp1.data) + 1);
            temp1 = temp1.next;
        }
        while(temp2!=null){
            if(!map.containsKey(temp2.data))
                map.put(temp2.data, 1);
            else
                map.put(temp2.data,map.get(temp2.data)+1);
            temp2=temp2.next;
        }
        Node res=new Node(0);
        Node ans=res;
        for( Map.Entry<Integer,Integer> i:map.entrySet()){
            if(i.getValue()>1) {
                res.next = new Node(i.getKey());
                res = res.next;
            }
        }
        res.next=null;
        return ans.next;
         
    }
