Node lca(Node node, int n1, int n2) 
    {
        if (n1 < node.data && n2 > node.data) {
            return node;
        }
        else if (n1 < node.data && n2 < node.data) {
            return lca(node.left, n1, n2);
        }
        else if (n1 > node.data && n2 > node.data) {
            return lca(node.right, n1, n2);
        }
        return node;
    }