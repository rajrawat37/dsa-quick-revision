public Stack<Integer> sort(Stack<Integer> s)
	{
	    if(s == null || s.isEmpty()) {
            return s;
        }
        Stack<Integer> s1 = new Stack<>();
        Integer top = null;
        while (!s.isEmpty()) {
            top = s.pop();
            while(!s1.isEmpty() && top < s1.peek()) {
                s.push(s1.pop());
            }
            s1.push(top);
        }
        return s1;
    }
