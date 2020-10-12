  //Approach-1
   
     boolean isPalindrome(Node head) {
        Node temp = head;
        StringBuilder st = new StringBuilder();
        while (temp != null) {
            st.append(temp.data);
            temp = temp.next;
        }
        String str=st.toString();
        st.reverse();
        System.out.println(str);
        return (str.equals(st.toString()));
    }
    
    
    
    
    //Approach-2
    
     boolean isPalindrome(Node head)
    {
         Node store = head;
        Stack<Integer> stack = new Stack<>();
        while (store != null) {
            stack.push(store.data);
            store = store.next;
        }
        while (head != null) {
            if (head.data != stack.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
