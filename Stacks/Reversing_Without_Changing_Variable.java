  //S = "20-3+5*2"
//Output: 2*5+3-20
  
  String reverseEqn(String S)
    {
        Stack<String> s= new Stack<>();
        String []str=S.split("(?<=[-+*/])|(?=[-+*/])");
         for(int i=0;i<str.length;i++){
              s.push(str[i]);
         }
         String res="";
         while(!s.empty())
            res+=s.pop();
       return res;
    }
