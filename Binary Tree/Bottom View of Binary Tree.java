class GfG
{
    // Should print bottom view of tree with given root
    public void bottomView(Node root)
    {
        Map<Integer, Integer> tm = new TreeMap<>();
        int hd = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        root.hd = 0;
        while (!q.isEmpty()) {
            Node temp = q.poll();
            hd = temp.hd;
            tm.put(hd, temp.data);
            if (temp.left != null) {
                q.add(temp.left);
                temp.left.hd = hd - 1;
            }
            if (temp.right != null) {
                q.add(temp.right);
                temp.right.hd = hd + 1;
            }
        }
        for (Map.Entry<Integer, Integer> m : tm.entrySet()) {
            System.out.print(m.getValue() + " ");
        }
    }
}
	