package LinkedList.MediumSLL;

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

public class SeggregateEvenOdd {

    private static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) System.out.print("->");
            curr = curr.next;
        }
        System.out.println();
    }

    private static Node createLl(int[] nums) {
        Node head = new Node(nums[0]);
        Node temp = head;
        for(int i = 1; i < nums.length; i++) {
            Node newNode = new Node(nums[i]);
            temp.next = newNode;
            temp = newNode;
        }
        return head;
    }

    private static Node segggregate(Node head) {
        Node odd = head;
        Node even = head.next, evenHead = even;
        while(even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        Node head = createLl(nums);
        printList(head);
        head = segggregate(head);
        printList(head);
    }

}
