 Node flatten(Node root) {
        Node p = root;
        Node q = root;
        Vector<Integer> v = new Vector<>();
        while (p != null) {
            while (q != null) {
                v.add(q.data);
                q = q.bottom;
            }
            p = p.next;
            q = p;
        }
        Collections.sort(v);
        Node curr = new Node(0);
        Node head = curr;
        for (int i : v) {
             curr.bottom= new Node(i);
             curr=curr.bottom;
        }
       return  head.bottom;
    }
