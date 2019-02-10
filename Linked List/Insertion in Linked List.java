Node insertAtBeginning(Node head1,int a1)
	{
	    Node nn = new Node(a1);
	    if (head1 == null) {
	        head1 = nn;
	    }
	    else {
	        nn.next = head1;
	        head1 = nn;
	    }
	    return head1;
	}
// function appends the data at the end of the list and returns the head of LL.
	Node insertAtEnd(Node head1,int a1)
	{
	    Node nn = new Node(a1);
	    if (head1 == null) {
	        head1 = nn;
	    }
	    else {
	        Node temp = head1;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = nn;
	    }
	    return head1;
	}