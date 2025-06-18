package LinkedList.SinglyLL;

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

public class CreateLL {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        Node n4 = new Node(nums[3]);
        Node n3 = new Node(nums[2], n4);
        Node n2 = new Node(nums[1], n3);
        Node n1 = new Node(nums[0], n2);

        Node temp = n1;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
}
