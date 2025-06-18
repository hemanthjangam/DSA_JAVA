package LinkedList.SinglyLL;

// Given a linked list, delete the tail of the linked list and print the updated linked list.

// Example 1:
// Input Format: 0->1->2
// Result: 0->1

// Example 2:
// Input Format: 12->5->8->7
// Result: 12->5->8

class Node {

    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }

}

public class DeleteNode {

    private static void printLL(Node head) {
        Node cur = head;
        while(cur != null) {
            System.out.print(cur.data + "->");
            cur = cur.next;
        }
    }

    private static Node deleteTail(Node head) {
        if(head == null || head.next == null) return null;
        Node cur = head;

        while(cur.next.next != null) {
            cur = cur.next;
        }
        cur.next = null;
        
        return head;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 6, 3};
        Node n5 = new Node(nums[4]);
        Node n4 = new Node(nums[3], n5);
        Node n3 = new Node(nums[2], n4);
        Node n2 = new Node(nums[1], n3);
        Node n1 = new Node(nums[0], n2);

        Node head = n1;
        printLL(head);
        System.out.println();
        deleteTail(head);
        printLL(head);
    }
}
