  static boolean ispar(String x)
    { 
         Stack<Character> s= new Stack<>();
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if(ch=='{' )
                 s.push('}');
               else if(ch=='[' )
                 s.push(']');
                 else if(ch=='(' )
                 s.push(')');
           else if(s.empty() || s.pop()!=ch) 
              return false;
        }
          return s.isEmpty();
   }
