package LinkedList.MediumSLL;



class ReverseLL {
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

    private static Node reverseIterative(Node head) {
        Node newHead = null, current = head;
        while(current != null) {
            Node front = current.next;
            current.next = newHead;
            newHead = current;
            current = front;
        }
        return newHead;
    }

    private static Node reverseReccursive(Node head) {
        if(head == null || head.next == null) return head;
        Node newHead = reverseReccursive(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        Node head = createLl(nums);
        printList(head);
        head = reverseIterative(head);
        printList(head);
        head = reverseReccursive(head);
        printList(head);
    }
}
