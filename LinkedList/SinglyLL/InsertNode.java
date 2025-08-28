package LinkedList.SinglyLL;

// Given a linked list and an integer value val, 
// insert a new node with that value at the beginning (before the head) 
// of the list and return the updated linked list.

// Example 1:
// Input Format: 0->1->2, val = 5
// Result: 5->0->1->2
// Explanation: We need to insert the value 5 before the head of the given Linked List.

// Example 2:
// Input Format:12->5->8->7, val = 100
// Result: 100->12->5->8->7
// Explanation: Again, we need to insert the value 100 before the head of the Linked List.




class InsertNode {

    private static Node insert(int val,Node  head) {
        Node temp = new Node(val, head);
        head = temp;

        return head;
    }

    private static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) System.out.print("->");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node n3 = new Node(2);
        Node n2 = new Node(1, n3);
        Node n1 = new Node(0, n2);

        Node head = n1;

        printList(head);
        
        System.out.println();
        head = insert(5, n1);

        printList(head);

    }
}
