package LinkedList.MediumSLL;

// Problem statement : Given the head of a linked list of integers, 
// determine the middle node of the linked list. 
// However, if the linked list has an even number of nodes, return the second middle node.

// Example 1:
// Input: LL: 1  2  3  4  5 
// Output: 3
// Explanation: Node with value 3 is the middle node of this linked list.
                                         
// Example 2:
// Input: LL: 1  2  3  4  5  6
// Output: 4
// Explanation:  In this example, the linked list has an even number of nodes hence we return the second middle node which is 4.


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

public class MiddleNode {

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

    private static int middle(Node head) {
        // Brute-force approach TC = O(N + N/2)
        // if(head == null || head.next == null) return head.data;
        // int length = 0;
        // Node temp = head;
        // while(temp != null) {
        //     length++;
        //     temp = temp.next;
        // }
        // int midpos = length / 2 + 1;
        // temp = head;
        // while(temp != null) {
        //     midpos = midpos - 1;
        //     if(midpos == 0) break;
        //     temp = temp.next;
        // }
        // return temp.data;

        // Better approach using Tortoise Hare algorithm
        Node slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        Node head = createLl(nums);
        printList(head);
        int midval = middle(head);
        System.out.println(midval);
    }
}
