import java.util.*;

public class solution {
	public static int Ceil(BinaryTreeNode<Integer> node, int input) {
       Stack<BinaryTreeNode> st = new Stack<>();
       int res = -1;
       BinaryTreeNode<Integer> curr = node;
       while (curr != null || !st.isEmpty()) {
           while (curr != null) {
               st.push(curr);
           	   curr = curr.left;
           }
           curr = st.pop();
           if (curr.data > input) {
               res = curr.data;
               break;
           }
           curr = curr.right;
       }
        return res;
	}
