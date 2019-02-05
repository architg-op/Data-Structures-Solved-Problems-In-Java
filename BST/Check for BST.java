/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Node {
    int data;
    Node left;
    Node right;
    Node (int x) {
        data = x;
        left = right = null;
    }
}



class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while (t-- != 0) {
	        Node root = null;
	        int n = sc.nextInt();
	        while (n-- != 0) {
	            int num = sc.nextInt();
	            root = createTree(root, num);
	        }
	        int cnt = sc.nextInt();
	        inOrder(root, cnt);
	    }
	}
	static Node createTree(Node root, int x) {
        if (root == null) {
            root = new Node(x);
        }
        else if (x < root.data) {
             root.left = createTree(root.left, x);
        }
        else if (x > root.data) {
             root.right = createTree(root.right, x);
        }
        return root;
    }

    static void inOrder(Node root, int cnt) {
        // if (a.)
        // if (root == null) {
        //     return;
        // }
        // inOrder(root.left);
        // a[cnt++] = root.data;
        // inOrder(root.right);
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Node> st = new Stack<>();
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
        int sum = 0;
        for (int i = 0; i < cnt; i++) {
            sum += al.get(i);
        }
        System.out.println(sum);
    }
}