public class SumListLinkedList {

    public static int sumLists(LinkedListNode head1, LinkedListNode head2) {
        //7 -> 1 -> 6  = 617
        //5 -> 9 -> 2  = 295

        double carry = 0;
        double addedNumbers = 0;
        int sum = 0;
        int multiple = 1;

        LinkedListNode c1 = head1;
        LinkedListNode c2 = head2;

        while(c1 != null || c2 != null) {

            if(carry > 0) {
                if(c1 != null)
                    addedNumbers += c1.data;

                if(c2 != null)
                    addedNumbers += c2.data;

                addedNumbers += carry;

                if(addedNumbers <= 9)
                    carry = 0;
            }
            else {
                if(c1 != null)
                    addedNumbers += c1.data;

                if(c2 != null)
                    addedNumbers += c2.data;

                if(addedNumbers <= 9)
                    carry = 0;
            }

            if(addedNumbers >= 10) {
                carry = 1;
                addedNumbers = addedNumbers % 10;
            }


            addedNumbers *= multiple;
            multiple *= 10;
            sum += addedNumbers;

            System.out.println(c1.data);
            System.out.println(c2.data);
            System.out.println("__________");
            System.out.print(addedNumbers + "   |    " + carry);
            System.out.println();

            c1 = c1.next;
            c2 = c2.next;
            addedNumbers = 0;
        }

        if(carry > 0) {
            System.out.println("Carry at end: " + carry);
            multiple *= 10;
            sum += multiple;
        }

        return sum;
    }
    //recursive

//    public static LinkedLinkedListNode sumListsRecursive(LinkedLinkedListNode n1, LinkedLinkedListNode n2, int carry) {
//        if(n1 == null && n2 == null && carry == 0)
//            return null;
//
//        LinkedLinkedListNode result = new LinkedLinkedListNode();
//        int value = carry;
//
//        if(n1 != null) {
//            value += n1.data;
//        }
//
//        if(n2 != null) {
//            value += n2.data;
//        }
//
//        result.data = value % 10;
//
//        if(n1 != null || n2 != null) {
//
//            LinkedLinkedListNode more = (n1 == null ? null : n1.next, n2 == null ? null : n2.next, value >= 10 ? 1 : 0);
//            result.setNext(more);
//        }
//
//        return result;
//    }
//

    public static LinkedListNode addListRecursively(LinkedListNode n1, LinkedListNode n2, int carry) {

        if(n1 == null && n2 == null)
            return null;
        LinkedListNode newNode = new LinkedListNode();
        int twoNumbersSumPlusCarry = carry;

        if(n1 != null)
            twoNumbersSumPlusCarry += n1.data;

        if(n2 != null)
            twoNumbersSumPlusCarry += n2.data;

        newNode.data = twoNumbersSumPlusCarry % 10;
        System.out.println("Data: " + newNode.data);

        if(n1 != null || n2 != null) {
            newNode.next = addListRecursively(n1 == null ? null : n1.next, n2 == null ? null : n2.next, twoNumbersSumPlusCarry >= 10 ? 1 : 0);
        }
        return newNode;
    }


    public static void main(String[] args) {
        LinkedListNode   n1 = new LinkedListNode(7);
        LinkedListNode n2 = new LinkedListNode(1);
        LinkedListNode n3 = new LinkedListNode(6);
        //LinkedListNode n4 = new LinkedListNode(1);

        LinkedListNode y1 = new LinkedListNode(5);
        LinkedListNode y2 = new LinkedListNode(9);
        LinkedListNode y3 = new LinkedListNode(2);

        LinkedListNode q1 = new LinkedListNode(9);
        LinkedListNode q2 = new LinkedListNode(1);
        LinkedListNode p1 = new LinkedListNode(1);
        LinkedListNode p2 = new LinkedListNode(4);

        q1.next = q2;
        p1.next = p2;


        n1.next = n2;
        n2.next = n3;
        //n3.next = n4;

        y1.next = y2;
        y2.next = y3;

        //System.out.println(sumLists(n1, y1));
        //System.out.println(sumListsRecursive(n1, y1, 0));
        LinkedListNode node = addListRecursively(n1, y1, 0);
        
        System.out.println(node.data);
    }
}