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

public class InsertInDLL {
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

    private static void printDLL(Node head) {
        while(head != null) {
            System.out.print(head.data + " <-> ");
            head = head.next;
        }
    }

    

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 1, 0};
        Node head = createDLL(nums);
        printDLL(head);
    }
}
