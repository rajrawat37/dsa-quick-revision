  Stack<Integer> s= new Stack<>();
	     String str=sc.next();
	      s.push(-1);
          int res = 0 ; 
        
        for(int i = 0 ; i<str.length() ;i++)
        {
            if(str.charAt(i) == '(')
                s.push(i);
            else
            {
                s.pop();
                if(!s.empty())
                    res = Math.max(res , i-s.peek());
                else
                    s.push(i);
            }
        }
        System.out.println(res);
