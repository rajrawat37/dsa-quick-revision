//Brute-Force
     static void calculateSpan(int price[], int n, int S[]) 
    { 
        S[0] = 1; 
        for (int i = 1; i < n; i++) { 
            S[i] = 1; 
            for (int j = i - 1; (j >= 0) && (price[i] >= price[j]); j--) 
                S[i]++; 
        } 
    } 

// Efficient-Approach

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
