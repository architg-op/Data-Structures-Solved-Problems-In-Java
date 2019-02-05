int minV(Node root) {
        int minV = root.key;
        while (root.left != null) {
            
            root = root.left;
            minV = root.key;
            
        }
        return minV;
    }
    
    Node deleteNode(Node root, int key) 
    {
	// Your code here
	    if (root == null) {
	        return root;
	    }
	    if (key < root.key) {
	        root.left = deleteNode(root.left, key);
	    }
	    else if (key > root.key) {
	        root.right = deleteNode(root.right, key);
	    }
	    else {
	        if (root.right == null) {
	            root = root.left;
	        }
	        else if (root.left == null) {
	            root = root.right;
	        }
	        else {
                root.key = minV(root.right);
                root.right = deleteNode(root.right, root.key);
	        }
	    }
	    return root;
    }