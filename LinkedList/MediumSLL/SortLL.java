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

public class SortLL {
    private static void printLL(Node head) {
        while(head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
    }

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

    private static Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static Node merge(Node leftHalf,Node rightHalf) {
        Node dummy = new Node(0);
        Node temp = dummy;
        while(leftHalf != null && rightHalf != null) {
            if(leftHalf.data <= rightHalf.data) {
                temp.next = leftHalf;
                leftHalf = leftHalf.next;
            }else {
                temp.next = rightHalf;
                rightHalf = rightHalf.next;
            }
            temp = temp.next;
        }
        if(leftHalf != null) temp.next = leftHalf;
        if(rightHalf != null) temp.next = rightHalf;

        return dummy.next;
    }

    private static Node mergeSort(Node head) {
        if(head == null || head.next == null) return head;
        Node midNode = findMidNode(head);

        Node rightHalf = midNode.next;
        midNode.next = null;
        Node leftHalf = head;

        leftHalf = mergeSort(leftHalf);
        rightHalf = mergeSort(rightHalf);
        
        return merge(leftHalf, rightHalf);
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 1, 2, 4};
        Node head = createLL(nums);
        printLL(head);
        System.out.println();
        head = mergeSort(head);
        printLL(head);
    }
}
