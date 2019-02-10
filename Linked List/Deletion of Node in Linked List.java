Node deleteNode(Node head, int x)
    {
        if (head == null) {
            
        }
        else {
            int cnt = 1;
            Node temp = head;
            Node prev = head;
            if (cnt == x) {
                head = head.next;    
            }
            while (cnt != x) {
                prev = temp;
                temp = temp.next;
                cnt++;
            }
            prev.next = temp.next;
        }
        return head;
    }