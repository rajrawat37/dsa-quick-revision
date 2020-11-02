 //Approach-1
 
 String removeDups(String S) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(int i=0;i<S.length();i++){
             set.add(S.charAt(i));
        }
        String str="";
        for(Character i : set)
          str+=i;
          return str;
    }
    
  //Approach-2
    
     String removeDups(String S) {
         LinkedHashSet<Character> hs=new LinkedHashSet<>();
	        for(int i=0;i<input.length();i++)
	             hs.add(input.charAt(i));
               
	        Iterator itr=hs.iterator();
	        while(itr.hasNext())
	        {
	            System.out.print(itr.next());
	        }
    }
