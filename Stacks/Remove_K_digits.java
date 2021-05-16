    public String removeKdigits(String num, int k)
    {
      StringBuilder str = new StringBuilder();
         
        // if (k >= num.length()) {
        //     return "0";
        // }
        // if (k == 0) {
        //     return num;
        // }
        Stack<Character> stk = new Stack<Character>();
 
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            while (!stk.isEmpty() && k > 0 && stk.peek() > ch) {
                stk.pop();
                k--;
            }
            if (!stk.isEmpty() || ch != '0')
                stk.push(ch);
        }

        while (!stk.isEmpty() && k--> 0) {
            stk.pop();
        }
        int check=stk.size();
        while (!stk.isEmpty()) {
            str.append(stk.pop());
        }
        String res = str.reverse().toString();
        return (check==0?"0":res);
    }
