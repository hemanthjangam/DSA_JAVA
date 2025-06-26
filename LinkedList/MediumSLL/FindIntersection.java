package LinkedList.MediumSLL;



// Example :

// List A: 1 → 3 → 5 → 7 → 9 → 11 → 13 → 15
// List B: 2 → 4 → 6 → 11 → 13 → 15

// List A:  1 → 3 → 5 → 7 → 9 
//                             ↘
//                               11 → 13 → 15 → NULL
//                             ↗
// List B:        2 → 4 → 6 →

// Explanation:
// The two linked lists intersect at node with value 11. After intersection, they share the same nodes.


public class FindIntersection {

    private static Node findIntersection(Node headA, Node headB) {
        Node one = headA, two = headB;
        while(one != two) {
          
            one = (one != null) ? one.next : headB;
            two = (two != null) ? two.next : headA;
        }
        return one;
    }
    public static void main(String[] args) {
         // Shared part
        Node intersection = new Node(11);
        intersection.next = new Node(13);
        intersection.next.next = new Node(15);

        // First list: 1 -> 3 -> 5 -> 7 -> 9 -> intersection
        Node headA = new Node(1);
        headA.next = new Node(3);
        headA.next.next = new Node(5);
        headA.next.next.next = new Node(7);
        headA.next.next.next.next = new Node(9);
        headA.next.next.next.next.next = intersection;

        // Second list: 2 -> 4 -> 6 -> intersection
        Node headB = new Node(2);
        headB.next = new Node(4);
        headB.next.next = new Node(6);
        headB.next.next.next = intersection;

        Node temp1 = headA, temp2 = headB;
        System.out.print("List1 : ");
        while(temp1 != null) {
            System.out.print(headA.data + "->");
            temp1 = temp1.next;
        }
        Node tempIntersection = intersection;
        while(tempIntersection != null) {
            System.out.print(tempIntersection.data + "->");
            tempIntersection = tempIntersection.next;
        }
        tempIntersection = intersection;
        System.out.println();
        System.out.print("List2 : ");
         while(temp2 != null) {
            System.out.print(headB.data + "->");
            temp2 = temp2.next;
        }
        while(tempIntersection != null) {
            System.out.print(tempIntersection.data + "->");
            tempIntersection = tempIntersection.next;
        }
        System.out.println();
        Node intersect = findIntersection(headA, headB);
        System.out.println(intersect.data);
    }
}
