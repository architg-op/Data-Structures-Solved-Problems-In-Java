Node insert(Node root, int data)
    {
         if (root == null) {
             root = new Node(data);
             return root;
         }
         else if (data < root.data) {
             root.left = insert(root.left, data);
         }
         else if (data > root.data) {
             root.right = insert(root.right, data);
         }
         return root;
    }