public class SumListLinkedList {

    public static int sumLists(ListNode head1, ListNode head2) {
        //7 -> 1 -> 6  = 617
        //5 -> 9 -> 2  = 295

        double carry = 0;
        double addedNumbers = 0;
        int sum = 0;
        int multiple = 1;

        ListNode c1 = head1;
        ListNode c2 = head2;

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

//    public static LinkedListNode sumListsRecursive(LinkedListNode n1, LinkedListNode n2, int carry) {
//        if(n1 == null && n2 == null && carry == 0)
//            return null;
//
//        LinkedListNode result = new LinkedListNode();
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
//            LinkedListNode more = (n1 == null ? null : n1.next, n2 == null ? null : n2.next, value >= 10 ? 1 : 0);
//            result.setNext(more);
//        }
//
//        return result;
//    }
//


    public static void main(String[] args) {
        ListNode n1 = new ListNode(7);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(6);
        ListNode n4 = new ListNode(1);

        ListNode y1 = new ListNode(5);
        ListNode y2 = new ListNode(9);
        ListNode y3 = new ListNode(2);

        ListNode q1 = new ListNode(9);
        ListNode q2 = new ListNode(1);
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(4);

        q1.next = q2;
        p1.next = p2;


        n1.next = n2;
        n2.next = n3;
        //n3.next = n4;

        y1.next = y2;
        y2.next = y3;

        System.out.println(sumLists(n1, y1));
        //System.out.println(sumListsRecursive(n1, y1, 0));

    }
}