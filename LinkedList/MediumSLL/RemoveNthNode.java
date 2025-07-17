package LinkedList.MediumSLL;

// Given a linked list and an integer N, 
// the task is to delete the Nth node from the end of the
//  linked list and print the updated linked list.

// Example 1:
// Input Format: 5->1->2, N=2
// Result: 5->2
// Explanation: The 2nd node from the end of the linked list is 1. 
// Therefore, we get this result after removing 1 from the linked list.

// Example 2:
// Input Format: 1->2->3->4->5, N=3
// Result: 1->2->4->5
// Explanation: The 3rd node from the end is 3, 
// therefore, we remove 3 from the linked list.


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

class RemoveNthNode {
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

    // brute approach using length of ll
    private static int length(Node head) {
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
    private static Node removeNth(Node head, int n) {
        int len = length(head);
        Node temp = head;
        int node = len - n;
        if(node == 0) return head.next;
        while(temp != null) {
            node--;
            if(node == 0){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
    }

    // optimal approach using two pointers and a dummy node TC O(n position + sizeOFLL)
    // private static Node removeNth(Node head, int n) {
    //     Node dummy = new Node(0);
    //     dummy.next = head;
    //     Node first = dummy, second = dummy;
    //     for(int i = 0; i < n; i++) {
    //         first = first.next;
    //     }
    //     while(first.next != null) {
    //         first = first.next;
    //         second = second.next;
    //     }
    //     second.next = second.next.next;

    //     return dummy.next;
    // }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        Node head = createLL(nums);
        printLL(head);
        head = removeNth(head, 3);
        System.out.println();
        printLL(head);
    }
}
