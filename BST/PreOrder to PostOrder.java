import java.util.*;
import java.lang.*;
import java.io.*;

class Node {
    int data;
    Node left;
    Node right;
    
    Node(int d) {
        data = d;
        left = right = null;
    }
}

class GFG
 {
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
    
    static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    
	public static void main (String[] args)
	 {
	     Node root = null;
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     while (t-- != 0) {
    	     int n = sc.nextInt();
    	     int a[] = new int[n];
    	     for (int i = 0; i < n; i++) {
    	         a[i] = sc.nextInt();
    	         root = createTree(root, a[i]);
    	     }
    	     postOrder(root);
    	     root = null;
    	     System.out.println();
	     }
	     
	   //  Stack<Node> st = new Stack<>();
	   //  Node curr = root;
	   //  while (curr != null || !st.isEmpty()) {
	   //      while (curr != null) {
	             
	   //      }
	   //  }
	     
	 }
}