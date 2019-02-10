boolean isIdentical(Node root1, Node root2)
	{
	    Stack<Node> st1 = new Stack<>();
	    ArrayList<Integer> al1 = new ArrayList<>();
	    Node curr = root1;
	    while (!st1.empty() || curr != null) {
	        while (curr != null) {
	            st1.push(curr);
	            curr = curr.left;
	        }
	        curr = st1.pop();
	        al1.add(curr.data);
	        curr = curr.right;
	    }
	    
	    Stack<Node> st2 = new Stack<>();
	    ArrayList<Integer> al2 = new ArrayList<>();
	    curr = root2;
	    while (!st2.empty() || curr != null) {
	        while (curr != null) {
	            st2.push(curr);
	            curr = curr.left;
	        }
	        curr = st2.pop();
	        al2.add(curr.data);
	        curr = curr.right;
	    }
	    
	    if (al1.size() != al2.size()) {
	        return false;
	    }
	    
	    for (int i = 0; i < al1.size(); i++) {
	        if (al1.get(i) != al2.get(i)) {
	            return false;
	        }
	    }
	    return true;
	}