class GfG{
    public int sumBT(Node root){
        Stack<Node> st = new Stack<>();
        int sum = 0;
        Node curr = root;
        while (st.size() > 0 || curr != null) {
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            sum += curr.data;
            curr = curr.right;
        }
        return sum;
   }
}