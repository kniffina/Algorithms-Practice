import java.util.LinkedList;

public class PartitionLinkedList {

    public static LinkedListNode partition(LinkedListNode node, int x) {
        LinkedListNode beforeStart = null;
        LinkedListNode beforeEnd = null;
        LinkedListNode afterStart = null;
        LinkedListNode afterEnd = null;

        while(node != null) {
            LinkedListNode next = node.next;
            node.next = null;

            if(node.data < x) {
                if(beforeStart == null) {
                    beforeStart = node;
                    beforeEnd = beforeStart; //even though these are the same, before start will always hold that start value
                }
                else {
                    //set beforeEnd next to the node
                    //then set beforeEnd to the node being pointed to
                    beforeEnd.next = node;
                    beforeEnd = beforeEnd.next; //can be beforeEnd = node
                }
            }
            else {
                if(afterStart == null) {
                    afterStart = node;
                    afterEnd = afterStart;
                }
                else {
                    afterEnd.next = node;
                    afterEnd = afterEnd.next; //can be afterEnd = node
                }
            }
            node = next;
        }

        if(beforeStart == null) {
            return afterStart;
        }

        beforeEnd.next = afterStart;

        return beforeStart;
    }

    public static void main(String[] args) {
        int length = 20;
        LinkedListNode[] nodes = new LinkedListNode[length];
        for (int i = 0; i < length; i++) {
            nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
        }

        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                nodes[i].setNext(nodes[i + 1]);
            }
            if (i > 0) {
                nodes[i].setPrevious(nodes[i - 1]);
            }
        }

        LinkedListNode head = nodes[0];
        System.out.println(head.printForward());

        //********* running
        LinkedListNode h = partition(head, 8);

        //**after
        System.out.println(h.printForward());
    }

}
