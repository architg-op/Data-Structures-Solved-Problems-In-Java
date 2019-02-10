public void kthLargest(Node root,int k)
    {
        Stack<Node> st = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        Node curr = root;
        while (!st.empty() || curr != null) {
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            al.add(curr.data);
            curr = curr.right;
        }
        System.out.println(al.get(al.size() - k));
    }