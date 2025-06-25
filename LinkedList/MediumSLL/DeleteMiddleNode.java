package LinkedList.MediumSLL;

class Node{
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

public class DeleteMiddleNode {
    private static Node createLL(int[] nums) {
        Node head = new Node(nums[0]);
        Node temp = head;
        for(int i = 1; i < nums.length; i++) {
            Node newNode = new Node(nums[i]);
            temp.next = newNode;
            temp = newNode;
        }
        return head;
    }

    private static void printLL(Node head) {
        while(head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
    }

    // private static int length(Node head) {
    //     int count = 0;
    //     while (head != null) {
    //         count++;
    //         head = head.next;
    //     }
    //     return count;
    // }

    // Brute-force approach by using len/2 
    // private static Node deleteMid(Node head) {
    //     if(head == null) return null;
    //     int len = length(head);
    //     int node = (len / 2);
    //     Node temp = head;
    //     while(temp != null) {
    //         node--;
    //         if(node == 0) {
    //             temp.next = temp.next.next;
    //             break;
    //         }
    //         temp = temp.next;
    //     }
    //     return head;
    // }

    // Optimal approach by using slow and fast pointers
    private static Node deleteMid(Node head) {
        if(head == null || head.next == null) return null;
        Node slow = head, fast = head, prev = null;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        Node head = createLL(nums);
        printLL(head);
        System.out.println();
        head = deleteMid(head);
        printLL(head);
    }
}
