 int n=sc.nextInt();
            Stack<Integer> stk= new Stack<>();
            Stack<Integer> s= new Stack<>();
            Stack<Integer> res= new Stack<>();
            for(int i=0;i<n;i++)
                stk.push(sc.nextInt());
            while(!stk.empty()){
                int x=stk.pop();
                while(!stk.empty() &&  x <=stk.peek())
                    s.push(stk.pop());
                if(!stk.empty())
                    res.push(stk.peek());
                else
                    res.push(-1);
                while(!s.empty())
                    stk.push(s.pop());
            }
            while(!res.empty())
                System.out.print(res.pop() + " ");
            System.out.println();
