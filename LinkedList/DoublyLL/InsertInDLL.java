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

    private static Node beforeHead(Node head, int val) {
        Node newHead = new Node(val, head, null);
        head.back = newHead;
        return newHead;
    }

    private static Node beforeTail(Node head, int val) {

        if(head == null) return null;
        if(head.next == null) {
           return beforeHead(head, val);
        }
        Node tail = head;
        while(tail.next != null) {
            tail = tail.next;
        }
        Node prev = tail.back;
        Node temp = new Node(val, tail, prev);
        prev.next = temp;
        tail.back = temp;
        return head;
    }

    private static Node beforeKth(Node head, int val, int k) {
        Node kth = head;
        if(k == 1) return beforeHead(head, val);
        int count = 0;
        while(kth != null) {
            count++;
            if(count == k) break;
            kth = kth.next;
        }
        
        Node prev = kth.back;
        Node newNode = new Node(val, kth, prev);
        prev.next = newNode;
        kth.back = newNode;
        return head;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 1, 0};
        Node head = createDLL(nums);
        printDLL(head);

        // insert a node before heaad
        head = beforeHead(head, 9);
        System.out.println();
        printDLL(head);

        // insert node before tail
        head = beforeTail(head, 0);
        System.out.println();
        printDLL(head);

        // insert node before kth position
        head = beforeKth(head, 5, 1);
        System.out.println();
        printDLL(head);
    }
}
