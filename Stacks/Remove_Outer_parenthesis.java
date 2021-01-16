//Approach-1

public String removeOuterParentheses(String S) {
       StringBuilder s = new StringBuilder();
        int open = 0;
        for (char c : S.toCharArray()) {
            if(c == '(') {
                open++;
                if(open> 1) 
                    s.append(c);
            } else {
                open--;
                if(open > 0) 
                    s.append(c);
                
            }
        }
        return s.toString();
    }
    
    
 //Approach - 2 
    
    public String removeOuterParentheses(String S) {
	StringBuilder s = new StringBuilder();
	Stack<Character> h = new Stack<>();

	for (int i = 0; i < S.length(); i++) {
		if (h.size() == 1 && S.charAt(i) == ')'){
			h.pop();
			continue;
		}
		else if (h.size() == 0 && S.charAt(i) == '('){
			h.push('(');
		}
		else if (S.charAt(i) == ')'){
			s.append(")");
			h.pop();
		}
		else if (S.charAt(i) == '('){
			s.append("(");
			h.push('(');
		}
	}
	return s.toString();
}
