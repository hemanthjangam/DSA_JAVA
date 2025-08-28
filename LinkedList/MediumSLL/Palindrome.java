package LinkedList.MediumSLL;



class Palindrome {
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

    private static Node reverse(Node head) {
        Node temp = head, prev = null;
        while(temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    
    private static boolean palindrome(Node head) {
        Node slow = head, fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        Node secondHead = reverse(slow);
        Node copy = secondHead;

        Node firstHead = head;
        while(secondHead != null && firstHead != null) {
            if(secondHead.data != firstHead.data) return false;
            secondHead = secondHead.next;
            firstHead = firstHead.next;
        }
        reverse(copy);
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 2, 1};
        Node head = createLl(nums);
        printList(head);
        boolean result = palindrome(head);
        System.out.println(result);
    }
}
