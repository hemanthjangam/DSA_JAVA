package LinkedList.SinglyLL;


class SearchInLL {

    private static boolean search(Node head, int target) {
        Node cur = head;
        if(cur == null) return false;
        while(cur != null) {
            if(cur.data == target) return true;
            cur = cur.next;
        }
        return false;
    }

    private static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) System.out.print("->");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 6, 3};
        Node n5 = new Node(nums[4]);
        Node n4 = new Node(nums[3], n5);
        Node n3 = new Node(nums[2], n4);
        Node n2 = new Node(nums[1], n3);
        Node n1 = new Node(nums[0], n2);
        int target = 34;
        Node head = n1;
        printList(head);
        boolean result = search(head, target);
        System.out.println(result);
    }
}
