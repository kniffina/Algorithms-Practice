import java.util.HashMap;

public class IntersectionLinkedList {

    public static LinkedListNode isIntersection(LinkedListNode n1, LinkedListNode n2) {
        if(n1 == null || n2 == null)
            return null;

        HashMap<LinkedListNode, Integer> hm = new HashMap<>();
        LinkedListNode curr1 = n1;
        LinkedListNode curr2 = n2;
        int count1 = 0, count2 = 0;

        while(curr1 != null) {
            hm.put(curr1, 1);
            curr1 = curr1.next;
        }

        while(curr2 != null) {
            if(hm.containsKey(curr2)) {
                return curr2;
            }
            else {
                hm.put(curr2, 1);
            }

            curr2 = curr2.next;
        }
        return null;
    }


    public static void main(String[] args) {
        LinkedListNode n1 = new LinkedListNode(6);
        LinkedListNode n2 = new LinkedListNode(4);
        LinkedListNode n3 = new LinkedListNode(2);
        LinkedListNode n4 = new LinkedListNode(3);
        LinkedListNode n5 = new LinkedListNode(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        LinkedListNode nn1 = new LinkedListNode(6);
        nn1.next = n3;


        LinkedListNode node = isIntersection(n1, nn1);

        while(node != null) {
            if(node.next != null)
                System.out.print(node.data + " -> ");
            else
                System.out.print(node.data);

            node = node.next;

        }
    }

}
