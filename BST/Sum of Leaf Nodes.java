class GfG
{
    static int sum = 0;
    static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            sum += root.data;
        }
        
        inOrder(root.left);
        inOrder(root.right);
    }
    
    public static int sumOfLeafNodes(Node root)
    {
        sum = 0;
        inOrder(root);
        return sum;
        /*if(root == null)
          return 0;
          
        if(root.left == null && root.right == null)
          return root.data;
          
        return sumOfLeafNodes(root.left)+sumOfLeafNodes(root.right);*/
    }
}