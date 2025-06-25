package LinkedList.MediumSLL;

public class SortLL0s1s2s {
    private static Node createLL(int[] nums) {
        Node head = new Node(nums[0]);
        Node temp = head;
        for(int i = 0; i < nums.length; i++) {
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

    private static Node sort(Node head) {
        Node temp = head;

        Node zeroNode = new Node(0), oneNode = new Node(0), twoNode = new Node(0);

        Node zero = zeroNode, one = oneNode, two = twoNode;

        while(temp != null) {
            if(temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            }else if(temp.data == 1) {
                one.next = temp;
                one = one.next;
            }else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
        two.next = null;
        zero.next = oneNode.next;
        one.next = twoNode.next;
        return zeroNode.next;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 1, 2, 0};
        Node head = createLL(nums);
        printLL(head);
        head = sort(head);
        System.out.println();
        printLL(head);
    }
}
