package LinkedList.SinglyLL;

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

public class LengthOfLL {

    private static int length(Node head) {
        Node cur = head;
        if(head == null) return 0;
        int count = 1;
        while(cur.next != null) {
            count++;
            cur = cur.next;
        }
        return count;
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
        int[] nums = {2, 4, 5, 6, 3};
        Node n5 = new Node(nums[4]);
        Node n4 = new Node(nums[3], n5);
        Node n3 = new Node(nums[2], n4);
        Node n2 = new Node(nums[1], n3);
        Node n1 = new Node(nums[0], n2);

        Node head = n1;
        printList(head);
        int len = length(head);
        System.out.println(len);
    }
}
