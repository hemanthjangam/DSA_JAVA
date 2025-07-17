package LinkedList.MediumSLL;

// import java.util.HashMap;
// import java.util.Map;

// Problem statement:
// detect a loop in a linked list

// Example1:       
// LL : 1 -> 2 -> 3 -> 4 -> 5
//                    ^     |
//                    |_____|
// Output = true

// Example2:
// LL: 1 -> 2 -> 5 -> 6 ->                 
// Output = false

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

class DetectLoopInLL {

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

    // Brute force approach usiing Hash map TC = O(N) SC = O(N)
    // private static boolean detect(Node head) {
    //     Map<Node, Integer> map = new HashMap<>();
    //     while(head != null) {
    //         if(map.containsKey(head)) return true;
    //         map.put(head, 1);
    //         head = head.next;
    //     }
    //     return false;
    // }

    // optimal approach by using tortoise hare algorithm TC = O(N) Sc = O(1)
    private static boolean detect(Node head) {
        Node slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        Node head = createLl(nums);
        System.out.println("1 -> 2 -> 3 -> 4 -> 5 -> 3");
        boolean result = detect(head);
        System.out.println(result);
    }
}
