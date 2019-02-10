import java.util.*;

public class solution {
	public static int Floor(BinaryTreeNode<Integer> node, int input) {	
        Stack<BinaryTreeNode> st = new Stack<>();
        int res = -1;
        BinaryTreeNode<Integer> curr = node;
        while (!st.isEmpty() || curr != null) {
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            if (curr.data < input) {
                res = curr.data;
            }
            curr = curr.right;
        }
        return res;
    }
}
