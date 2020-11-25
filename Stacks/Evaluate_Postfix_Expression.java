public static String evaluatePostFix(String exp){
      // initializing empty String for result 
        String result = new String(""); 
          
        // initializing empty stack 
        Stack<Integer> s = new Stack<>(); 
          
        for (int i = 0; i<exp.length(); ++i) 
        { 
            char c = exp.charAt(i); 
              if(c>='0' && c<='9') 
                 s.push(c-'0');
                 
              else{
                   int n1=s.peek();
                    s.pop();
                   int n2=s.peek();
                   s.pop();
                     if(c == '*')
            {
                s.push(n1*n2);
            }
            else if(c == '/')
            {
                s.push(n2/n1);
            }
            else if(c == '+')
            {
                s.push(n1+n2);
            }
            else if(c == '-')
            {
                s.push(n2-n1);
            }
        }
        }
        return String.valueOf(s.peek());
        
      }
