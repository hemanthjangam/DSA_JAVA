package LinkedList.MediumSLL;

// Problem statement:
// detect a loop's starting point in a linked list

// Example1:       
// LL : 1 -> 2 -> 3 -> 4 -> 5
//                    ^     |
//                    |_____|
// Output = 3

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

public class LengthOfLoopInLL {

    private static Node createLl(int[] nums) {
        Node head = new Node(nums[0]);
        Node temp = head, copy = null;
        for(int i = 1; i < nums.length; i++) {
            Node newNode = new Node(nums[i]);
            temp.next = newNode;
            temp = newNode;
            if(i == 2){
                copy = temp;
            }
        }
        temp.next = copy;
        return head;
    }

    private static int detect(Node head) {
        Node slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        Node start = head;
        while(start != slow) {
            start = start.next;
            slow = slow.next;
        }
        return start.data;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        Node head = createLl(nums);
        System.out.println("1 -> 2 -> 3 -> 4 -> 5 -> 3");
        int detect = detect(head);
        System.out.println(detect);
    }
}
