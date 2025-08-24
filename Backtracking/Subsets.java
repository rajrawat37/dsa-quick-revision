/*
- At Each level i have two choices , to pick current index or not pick
- There will be a total of n levels
- Time complexity would be total calls done in recursion
- To find sum of all recursive calls for n=4, 
    => 2+4+8+16 = 15+16 = (2^n + 2^n) - 1 => (2.2^n)-1 => (2^n+1 - 1) => ~ O(2^n)
    => T.C = O(2^n)
- Space Complexity = Auxillary space + Actual space
   => Auxillary space = O(n) : maximum depth a recursion stack can go.
   => Actual space = 2^n subsets total, (2^n/2) are pairs => Each pair will have n characters => n*(2^n/2) => n*(2^(n-1)) => ~O(n.2^n)
   => S.C = O(n) + O(n.2^n) => O(n.2^n)

*/

// Subset - 1 (no duplicates)
  
temp.add(arr[i]);
solve(i+1);
temp.remove(temp.size()-1);

solve(i+1);

// Subset - 2(with duplicates)


temp.add(arr[i]);
solve(i+1);
temp.add(temp.size()-1);


// Prune the tree when not picking an element as, not picking a element means we are copying a previous state and if the element in current level is similar to element in prev level, and state at this level is similar to state at prev level then this will
// generate duplicate subsets, so to avoid this we will skip the recursive calls from a state that already has appeared(which appears when we skip a element) and direclty jump to the next state which is different(to do this we need to skip the similar blocks).
// So to skip duplicates basically while not picking aa element we wil jump direclty to the state that didn't appeared earlier(in short we need to skip all consecutive similiar elements, and make call for next diff element as state)

Arrays.sort(arr); // so we can easily skip the duplicates and prune some states in the tree

temp.add(arr[i]);
solve(i+1);
temp.remove(temp.size()-1);

int next=i+1;
while(next<arr.length && ch[i]==ch[next]) next++; // skipping all blocks having similar element at prev level and jumping to state which has diff element
solve(next);
