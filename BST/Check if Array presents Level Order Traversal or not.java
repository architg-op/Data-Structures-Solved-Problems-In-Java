import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    
    Node(int d) {
        data = d;
        left = right = null;
    }
  
}



class GFG {
    static Node createTree(Node root, int d) {
        if (root == null) {
            root = new Node(d);
        }
        else if (d < root.data) {
            root.left = createTree(root.left, d);
        }
        else {
            root.right = createTree(root.right, d);
        }
        return root;
    }
    
	public static void main (String[] args) {
	    int j = 0;
	    int f = 0;
	    Node root = null;
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a[] = new int[n];
	    for (int i = 0; i < n; i++) {
	        a[i] = sc.nextInt();
	        root = createTree(root, a[i]);
	    }
	    Queue<Node> q = new LinkedList<>();
	    Node curr = null;
	    q.add(root);
	    while (!q.isEmpty()) {
	        curr = q.remove();
	        if (a[j++] != curr.data) {
	            f = 1;
	            break;
	        }
	        if (curr.left != null) {
	            q.add(curr.left);
	        }
	        if (curr.right != null) {
	            q.add(curr.right);
	        }
	    }
	    if (f == 0) {
	        System.out.println("Yes");
	    }
	    else {
	        System.out.println("No");
	    }
	}
}