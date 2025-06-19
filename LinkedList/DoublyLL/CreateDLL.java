package LinkedList.DoublyLL;

class Node {
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}

public class CreateDLL {
    private static Node createDLL(int[] nums) {
        Node head = new Node(nums[0]);
        Node prev = head;
        for(int i = 1; i < nums.length; i++) {
            Node temp = new Node(nums[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static void printDLl(Node head) {
        while(head != null) {
            System.out.print(head.data + "<->");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 7, 3};
        Node head = createDLL(nums);
        printDLl(head);
    }
}
