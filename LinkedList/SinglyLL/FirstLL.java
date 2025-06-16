package LinkedList;

// Definition of a Node class used in linked lists
class Node {
    // Variable to store the data of the node
    int data;

    // Reference to the next node in the list
    Node next;

    // Constructor that initializes both data and next node reference
    Node(int data1, Node next1) {
        this.data = data1;   // Assign the given data to the node
        this.next = next1;   // Set the reference to the next node
    }

    // Constructor that initializes only the data and sets next to null
    Node(int data1) {
        this.data = data1;   // Assign the given data to the node
        this.next = null;    // Set next to null since it's the end or unlinked
    }
}


public class FirstLL {

    private static Node convertArr2LL(int[] nums) {
        Node head = new Node(nums[0]);       // Step 1: Create the head node using the first element
        Node mover = head;                   // Step 2: Initialize mover to point to head

        for(int i = 1; i < nums.length; i++) {
            Node temp = new Node(nums[i]);  // Step 3: Create a new node for each remaining element
            mover.next = temp;              // Step 4: Link the current node to the new node
            mover = temp;                   // Step 5: Move the pointer to the new node
        }

        return head;                        // Step 6: Return the head of the linked list
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        Node head = convertArr2LL(nums);
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
}
