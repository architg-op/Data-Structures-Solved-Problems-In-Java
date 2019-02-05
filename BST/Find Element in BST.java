boolean search(Node root, int x)
    {
        if (root == null) {
            return false;
        }
        else if (root.data == x) {
            return true;
        }
        else if (x < root.data) {
            return search(root.left, x);
        }
        else {
            return search(root.right, x);
        }
    }