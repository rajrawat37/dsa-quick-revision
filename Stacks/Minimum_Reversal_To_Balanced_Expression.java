 //Approach - 1
 
 String s =sc.next();
	   if(s.length()%2!=0)
	      System.out.println("-1");
	     else{
	        int l=0,c=0;
	        Stack<String> stk= new Stack<>();
	       for(int i=0;i<s.length();i++){
	         char ch=s.charAt(i);
	           if(ch=='{')
	             l++;
	           if(ch=='}')
	               l--;
	           if(l<0){
	               l=1;
	               c++;
	           }    
	    }
	    c=c+l/2;
	     System.out.println(c);
	 }
   
   //Approach - 2
   
   
   
   String s =sc.next();
	   if(s.length()%2!=0)
	      System.out.println("-1");
	     else{
	        int l=0,c=0;
	        Stack<Character> stk= new Stack<>();
	       for(int i=0;i<s.length();i++){
	         char ch=s.charAt(i);
	           if(ch=='{')
	               stk.push('{');
	           else{
	              if(stk.empty())
	                l++;
	                else
	                stk.pop();
	           }
	       }    
	    c=(l+1)/2 +(stk.size()+1)/2;
	     System.out.println(c);
	 }
   
   
   
   //Appproach - 3
   
   
     String s =sc.next();
	   if(s.length()%2!=0)
	      System.out.println("-1");
	     else{
	        int rev=0;
	        Stack<Character> stk= new Stack<>();
	       for(int i=0;i<s.length();i++){
	         char ch=s.charAt(i);
	           if(ch=='{')
	               stk.push('{');
	           else{
	              if(stk.empty()){
	                 stk.push('{');
	                 rev++;
	              }
	                else
	                stk.pop();
	           }
	       }    
	    rev+=stk.size()/2;
	     System.out.println(rev);
	 }
   
   
   //Approach - 4
   
   
    static void countreversal(String exp){
		int len = exp.length();
		if(len%2 !=0){
			System.out.println(-1);
			return;
		}
		Stack<Character> S = new Stack<Character>();
		
		for(int i =0; i<len; i++){
			char c = exp.charAt(i);
			if(c == '}' && !S.empty()){
				if(S.peek()=='{')
					S.pop();
				else
					S.push(c);
			}else
				S.push(c);
		}
		
		int reduseLenght = S.size();
		int n =0;
		while(!S.empty() && S.peek() == '{'){
			S.pop();
			n++;
		}
		int ans = (reduseLenght/2 + n%2);
		System.out.println(ans);
	}
